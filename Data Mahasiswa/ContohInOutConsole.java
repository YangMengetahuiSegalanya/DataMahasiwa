/* Membaca Masukan dari keyboard dengan class Consule
   by Totok Sukardiyono
   Java.io.Console menyediakan metode untuk mengakses perangkat konsol berbasis karakter. 
   class Console mulai ada atau ditambahkan ke Java.io pada JDK 6 dan
   digunakan untuk membaca dari dan menulis ke konsol, jika ada.
   Console tidak menyediakan/memasok konstruktor, sehingga objek Console diperoleh dengan 
   memanggil System.console() 
   format :
   Console console = System.console();
   Method di class Console
   Reader reader(), String readLine(), char[] readPassword(), PrintWriter writer(),
   Console printf(String format, Object... args), Console format(String fmt, Object... args), void flush()
   Menggunakan metode readLine() dari kelas Console untuk menulis baris ke konsol dan 
   kemudian membaca baris dari konsol:
   String progLanguauge = console.readLine("Enter your favourite programming language: ");
   Membaca informasi sensitif, seperti kata sandi, kita dapat menggunakan metode readPassword() 
   untuk meminta kata sandi pengguna dan membaca kata sandi dari konsol dengan gema dinonaktifkan:
   char[] pass = console.readPassword("To finish, enter password: ");
   Menggunakan kelas Console untuk menulis output ke konsol, 
   misalnya menggunakan metode printf() dengan argumen String:
   console.printf(progLanguauge + " is very interesting!");
   Jika konsol tersedia, maka referensi untuk itu dikembalikan dan jika tidak, null dikembalikan. 
   Konsol tidak akan tersedia dalam semua kasus. 
   Jadi, jika null dikembalikan, I/O konsol tidak dimungkinkan.
   Ini menyediakan metode untuk membaca teks dan kata sandi. 
   Jika membaca kata sandi menggunakan kelas Konsol, itu tidak akan ditampilkan kepada pengguna. 
   Kelas java.io.Console dilampirkan dengan konsol sistem secara internal.
*/

import java.io.Console;
import java.io.*;
import java.util.Scanner;
public class ContohInOutConsole {
 public static void main(String[] args) {
  String nama,alamat,psw;
  int usia,np;
  // membuat objek console
  Console cin = System.console();
  if(cin == null) {
   System.out.print("Console tidak tersedia");
   return;
  }
  // mengisi variabel nama dan usia dengan method readline pada class console
  //System.out.print("Nama: ");
  nama = cin.readLine("Nama : ");
  //System.out.print("Usia : ");
  usia = Integer.parseInt(cin.readLine("Usia : "));
  //mengisi alamat dan nomor presensi dengan method reader pada class console
  System.out.print("Alamat : " );
  Scanner baca = new Scanner(cin.reader());
  //while(baca.hasNext())
  alamat = baca.nextLine(); 
  // mengisi password dengan method readPassword pada class console
  char[] password = cin.readPassword("Masukkan Password :");
  psw = new String(password);
  String pass=String.valueOf(password);//converting char array into string
  // menampilkan isi variabel nama dan usia
  PrintWriter tulis = cin.writer();
  tulis.write(nama); 
  tulis.println(); 
  System.out.println("Saat ini berusia " + usia + " tahun");
  System.out.println(alamat);
  System.out.println("Passwordmu adalah: " + psw);
  System.out.println("Passwordmu adalah: " + pass);
 }
}


