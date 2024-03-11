import java.util.Scanner;

public class CamelCase {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Menerima input string
    System.out.print("Kata: ");
    String Kata = scanner.nextLine();

    // Return fungsi toCamelString untuk mengubah string menjadi camel case
    String CamelCaseOutput = toCamelString(Kata);
    System.out.println("Kata dalam Camel Case: " + CamelCaseOutput);
  }


  public static String toCamelString(String Kata){
    String camelcase = ""; // string untuk menyimpan hasil camel case
    boolean Capitial = false; // Variabel untuk menandai apakah huruf berikutnya harus diubah menjadi huruf besar

    for(char karakter: Kata.toCharArray()){
      if (karakter == ' '){
        Capitial = true;
      }
      else{
        if (Capitial){
          // Jika Capitial true, maka karakter akan diubah menjadi huruf besar
          camelcase += Character.toUpperCase(karakter);
          Capitial = false;
        }
        else{
          camelcase += karakter; // Jika Capitial false, karakter akan ditambahkan ke string Camel Case
        }
      }
    }
    return camelcase;
  }
}
