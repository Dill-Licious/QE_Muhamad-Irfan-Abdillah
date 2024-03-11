import java.util.Scanner;

public class BiayaPengiriman {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Membaca input dari user berupa berat paket 
    System.out.print("Berat paket (kg): ");
    int BeratPaket = scanner.nextInt();
    
    // logic berat paket
    int Cost_BeratPaket = 0;
    if(BeratPaket < 2){
      Cost_BeratPaket = 10000;
    }
    else if(BeratPaket >=2 && BeratPaket <= 7){
      Cost_BeratPaket = 15000;
    }
    else  if(BeratPaket >= 8 && BeratPaket <= 15){
      Cost_BeratPaket = 25000;
    }
    else{
      Cost_BeratPaket = 40000;
    }

    // Membaca input dari user berupa jarak tempuh
    System.out.print("Jarak tempuh (km): ");
    int JarakTempuh = scanner.nextInt();
    
    int Cost_JarakTempuh = 0;
    if(JarakTempuh < 1){
      Cost_JarakTempuh = 2000;
    }
    else if(JarakTempuh >= 1 && JarakTempuh <= 7){
      Cost_JarakTempuh = 5000;
    }
    else  if(JarakTempuh >= 8 && JarakTempuh <= 15){
      Cost_JarakTempuh = 10000;
    }
    else if (JarakTempuh > 15) {
      Cost_JarakTempuh = 20000;
    }

    // return total biaya
    int TotalBiaya = Cost_BeratPaket + Cost_JarakTempuh;
    System.out.println("Biaya: " + TotalBiaya);
  }
}