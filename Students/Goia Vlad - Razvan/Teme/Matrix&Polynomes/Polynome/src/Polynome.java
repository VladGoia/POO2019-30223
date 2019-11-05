
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class Polynome{
		public static void main(String[] args) throws FileNotFoundException {
		int[] x;
			int[] y;
			int x_size = 0;
			int y_size = 0;
			File file = new File("C:\\Users\\Vlad\\Documents\\GitHub\\POO2019-30223\\Students\\Goia Vlad - Razvan\\Teme\\Matrix&Polynomes\\pol.txt");
			Scanner sc = new Scanner(file);
			String coefPoly1 = sc.nextLine();
			String coefPoly2 = sc.nextLine();

			String[] tokens = coefPoly1.split(" ");
			for (String i : tokens)
				x_size++;
			x = new int[x_size];
			int k = 0;
			for (String i : tokens)
				x[k++] = Integer.parseInt(i);

			tokens = coefPoly2.split(" ");
			for (String i : tokens)
				y_size++;

			y = new int[y_size];
			k = 0;
			for (String i : tokens)
				y[k++] = Integer.parseInt(i);

			Polynome P = new Polynome(x);
			Polynome Q = new Polynome(y);
			System.out.println("Polinoamele:");
			System.out.println(P.toString());
			System.out.println(Q.toString());
			System.out.println("\nRezultatele:");
			Polynome resultPolynomial;
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				
				int scal = 0;
				int eval = 0;
				if (s.contains("ADD")) {
					resultPolynomial = P.add(Q);
					System.out.println(resultPolynomial.toString());
				}
				if (s.contains("SUBTRACT")) {
					resultPolynomial = P.subtract(Q);
					System.out.println(resultPolynomial.toString());
				}
				if (s.contains("MULTIPLY")) {
					resultPolynomial = P.multiply(Q);
					System.out.println(resultPolynomial.toString());
				}
				if (s.contains("MUL_SCAL")) {
					scal = Integer.parseInt(s.substring(9));
					resultPolynomial = P.mul_scal(scal);
					System.out.println(resultPolynomial.toString());
					resultPolynomial = Q.mul_scal(scal);
					System.out.println(resultPolynomial.toString());
				}
				if (s.contains("EVAL")) {
					eval = Integer.parseInt(s.substring(5));
					double rez = P.eval(eval);
					System.out.println(rez);
					rez = Q.eval(eval);
					System.out.println(rez);
				}

			}
		}
		
	private int degree; 
	private int[] coeff; 

	public Polynome(int c[]) {
		coeff = new int[c.length + 1];
		for (int i = 0; i < c.length; i++)
			coeff[i] = c[c.length - i - 1];
		degree = getDegree();
	}

	public Polynome(int d, int term) {
		coeff = new int[d + 1];
		coeff[d] = term;
		degree = getDegree();
	}

	public Polynome(Polynome p){
		coeff = new int[p.coeff.length];
		for (int i = 0; i < p.coeff.length; i++)
			coeff[i] = p.coeff[i];
		degree = p.degree;
	}

	public int getDegree() {
		int grad = 0;
		for (int i = 0; i < coeff.length; i++)
			if (coeff[i] != 0)
				grad = i;
		return grad;
	}
	public int getCoefficients(int i) {
		return coeff[i];
	}

	public Polynome add(Polynome p) {
		Polynome x = this;
		Polynome sum = new Polynome(Math.max(x.degree, p.degree), 0);

		for (int i = 0; i <= x.degree; i++)
			sum.coeff[i] += x.coeff[i];
		for (int i = 0; i <= p.degree; i++)
			sum.coeff[i] += p.coeff[i];

		sum.degree = sum.getDegree();
		return sum;
	}

	public Polynome subtract(Polynome p) {
		Polynome x = this;
		Polynome diff = new Polynome(Math.max(x.degree, p.degree), 0);

		for (int i = 0; i <= x.degree; i++)
			diff.coeff[i] += x.coeff[i];
		for (int i = 0; i <= p.degree; i++)
			diff.coeff[i] -= p.coeff[i];
		
		diff.degree = diff.getDegree();
		return diff;
	}

	public Polynome multiply(Polynome p) {
		Polynome x = this;
		int new_degree = x.degree + p.degree;
		Polynome product = new Polynome(new_degree, 0);

		for (int i = 0; i <= x.degree; i++)
			for (int j = 0; j <= p.degree; j++)
				product.coeff[i + j] += (x.coeff[i] * p.coeff[j]);

		product.degree = product.getDegree();
		return product;

	}
	public Polynome mul_scal(int scalar)
	{
		Polynome zero = new Polynome(0,0);
		Polynome x = new Polynome(this.degree, 0);
		if(scalar == 0)
			return zero;
		
		for(int i = 0; i <= this.degree; i++)
			x.coeff[i] = this.coeff[i]*scalar;
		x.degree = x.getDegree();
		return x;
	}
	public double eval(double n)
	{
		double result = 0;
		for(int i=0; i<= this.degree; i++)
			result += (coeff[i] * Math.pow(n, (double)(i)));
		
		return result;
	}
	public boolean isZero(Polynome p)
	{
		for(int i=0; i<p.degree; i++)
			if(p.coeff[i] != 0)
				return false;
		return true;
	}
    public int coeff(){return coeff( getDegree() ); }

    public int coeff( int degree ){

        if( degree > this.getDegree() ) throw new RuntimeException( "bad degree" );

        return coeff[degree];

    }

	public Polynome[] division(Polynome p)
	{
		Polynome r = new Polynome(this);
		Polynome q = new Polynome(0,0);
		while(!isZero(r) && r.getDegree() >= p.getDegree())
		{
			int coef = r.coeff() / p.coeff();
			int gr = r.getDegree() / p.getDegree();
			Polynome t = new Polynome(gr, coef);
			q = q.add(t);
			r = r.subtract(t.multiply(p));
		}
		System.out.printf( "(%s) / (%s): %s, %s", this, p, q, r );
        return new Polynome[]{ q, r };
	}
	public String toString() {
		if (degree == 0)
			return "" + coeff[0];
		if (degree == 1)
			if(coeff[1] == 1)
			return  "x + " + coeff[0];
			else
				if(coeff[1] == -1)
					return "-x + " + coeff[0];
				else
					return coeff[1] + "x + " + coeff[0];

		String polynome = "";

		if (coeff[degree] == 1)
			polynome = "x^" + degree;
		else if (coeff[degree] == -1)
			polynome = "-x^" + degree;
		else
			polynome = coeff[degree] + "x^" + degree;

		for (int i = degree - 1; i >= 0; i--) {
			if (coeff[i] == 0)
				continue;
			else if (coeff[i] == 1)
				polynome = polynome + " + 1";
			else if (coeff[i] == -1)
				polynome = polynome + " - 1";
			else if (coeff[i] > 0)
				polynome = polynome + " + " + coeff[i];
			else if (coeff[i] < 0)
				polynome = polynome + " - " + (-coeff[i]);

			if (i == 1)
				polynome = polynome + "x";
			else if (i > 1)
				polynome = polynome + "x^" + i;
		}
		return polynome;
	}
}
