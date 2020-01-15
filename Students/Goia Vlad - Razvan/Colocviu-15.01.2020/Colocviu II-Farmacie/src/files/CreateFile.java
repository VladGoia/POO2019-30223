package files;
import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj1 = new File("detalii_pacienti.txt");
      File myObj2 = new File("detalii_medicamente.txt");
      if (myObj1.createNewFile() && myObj2.createNewFile()) {
        System.out.println("Fisier creat: " + myObj1.getName());
        System.out.println("Fisier creat: " + myObj2.getName());
      } else {
        System.out.println("Fisierul exista deja.");
      }
    } catch (IOException e) {
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}