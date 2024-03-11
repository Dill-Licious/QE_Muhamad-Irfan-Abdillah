import java.util.Scanner;

public class HurufVokal {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kata: ");
    String Kata = scanner.nextLine();

    String kataTerubah = ubahKata(Kata);
    System.out.println("Kata Terubah: " + kataTerubah);
  }

  public static String ubahKata(String Kata){
    String hasil = "";

    for(int i = 0; i < Kata.length(); i++){
      // mengambil karakter pada posisi indeks ke-i dari string Kata
      char huruf = Kata.charAt(i);
      switch (huruf) {
        case 'a':
        case 'A':
          hasil += '4'; // += untuk menggabungkan string dgn char ke dalam string yang sudah ada
          break;
        case 'e':
        case 'E':
          hasil += '3';
          break;
        case 'i':
        case 'I':
          hasil += '1';
          break;
        case 'o':
        case 'O':
          hasil += '0';
          break;
        default:
          hasil += huruf;
      }
    }
    return hasil;
  }
}
