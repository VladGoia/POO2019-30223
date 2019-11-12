public class BankMain {

	public static void main (String[] argv) 
	{
		Account cont1 = new Account(17);
		
		cont1.deposit(1500);
		System.out.println("Numarul contului: " +cont1.getAccountNumber());
		System.out.println("Soldul contului inainte de extragere: " +cont1.getBalance());
		cont1.withdraw(510);
		System.out.println("Soldul contului dupa extragere: " +cont1.getBalance());
		
		SavingsAccount cont2 = new SavingsAccount(1,5);
		System.out.println(cont2.getBalance());
		cont2.setInterest(2000);
		System.out.println(cont2.getBalance());
		cont2.deposit();
		System.out.println(cont2.getBalance());
		
		CurrentAccount cont3 = new CurrentAccount(1,0);
		cont3.setOverdraft(100);
		cont3.deposit(500);
		System.out.println(cont3.getBalance());
		cont3.withdraw(100);
		System.out.println(cont3.getBalance());
		cont3.withdraw(300);
		System.out.println(cont3.getBalance());
		
		cont3.setOverdraft(50);
		cont3.withdraw(300);
		System.out.println(cont3.getBalance());
	}
	
}