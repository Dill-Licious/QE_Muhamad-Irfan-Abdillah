import java.util.Scanner;

public class HabisDibagi {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("Jumlah angka: ");
    int Angka = scanner.nextInt();

    System.out.print("Nilai n: ");
    int n = scanner.nextInt();
    
    for(int i = 1; i <= Angka; i++){
      int value = i * n;
      System.out.println(value);
    }
  }
}
