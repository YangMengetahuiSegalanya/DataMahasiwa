/* Membaca Masukan dari keyboard dengan class Scanner
   by Totok Sukardiyono
   Format :
   Scanner obj = new Scanner(System.in);
   tipedata var = obj.konversi_string_ke_tipedata
   konversi_string_ke_tipedata pilih salah satu:
   nextLine()  - Menerima input String (kalimat)
   next()      - Menerima input String (kata)
   nextInt     - Menerima input bilangan bulat/Integer
   nextBoolean - Menerima input Boolean (true/false)
   nextFloat   - Menerima input pecahan/Float
   nextDouble  - Menerima input pecahan/Double
   nextByte    - Menerima bilangan bulat/Byte
   nextLong    - Menerima bilangan bulat/Long
   nextShort   - Menerima bilangan bulat/Short
   Untuk mengetahui lebih detail tentang class Scanner dan method-methodnya 
   baca di : https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
*/

import java.util.Scanner;
public class ContohScanner {
 public static void main(String[] args) {
  Scanner osc = new Scanner(System.in);
  System.out.println("===== Program Nginput Data =====");
  System.out.println("===== Memasukan Data =====");
  //Memasukkan data dari keyboard
  System.out.print("Nama Lengakap  : ");
  String nama = osc.nextLine();
  System.out.print("Nama Panggilan : ");
  String np = osc.next();
  System.out.print("Umur           : ");
  int umur = osc.nextInt();

  //Menampilkan Data ke Layar Monitor 
  System.out.println("\n===== Menampilkan Data =====");
  System.out.println("Nama Lengkap   : " + nama);
  System.out.println("Nama Panggilan : " + np);
  System.out.println("Umur           : " + umur + " Tahun");
 }
}


