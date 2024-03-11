import java.util.Scanner;

public class PersegiPanjang {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Panjang: ");
    int Panjang = scanner.nextInt();

    System.out.print("Lebar: ");
    int Lebar = scanner.nextInt();

    int Luas = 0;
    Luas = Panjang * Lebar;

    if(Luas % 2 == 0){
      System.out.print("even rectangle");
    }
    else{
      System.out.print("odd rectangle");
    }
  }
}
