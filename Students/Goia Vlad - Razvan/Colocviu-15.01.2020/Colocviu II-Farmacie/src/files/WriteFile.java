package files;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter1 = new FileWriter("detalii_pacienti.txt");
      myWriter1.write(" Georgiu Alin 20 masculin"
      		+ "\nGarbou Raul 20 feminin"
      		+ "\nBouaru Radu 20 masculin"
      		+ "\nIosif Radu 20 masculin");
      myWriter1.close();
      
      FileWriter myWriter2 = new FileWriter("detalii_medicamente.txt");
      myWriter2.write(" Xanax Raul&co 200 200"
      		+ "\nStrepsils medicament&co 20 180"
      		+ "\nParasinus bouaru 15 200"
      		+ "\nCoca Georgiu 200 1");
      myWriter2.close();
      
      System.out.println("S-a scris cu succes.");
    } catch (IOException e) {
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}