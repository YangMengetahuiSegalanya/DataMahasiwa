/* Membaca Masukan dari keyboard dengan class BufferReader
   by Totok Sukardiyono
   Format :
   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
   String var = obj.readLine();
   type_data var = parsing(obj.readLine());
   parsing gunakan salah satu berikut sesuai dengan tipe datanya
   Byte.parseByte     => byte varByte = Byte.parseByte(strVarByte);
   Short.parseShort   => short varShort = Short.parseShort(strVarShort);
   Integer.parseInt   => int varInteger = Integer.parseInt(strVarInteger);
   Long.parseLong     => long varlong = Long.parseLong(strVarLong);
   Float.parseFloat   => float varFloat = Float.parseFloat(strVarFloat);
   Double.parseDouble => double varDouble = Double.parseDouble(strVarDouble);
   atau dengan ValueOf(data String angka)
   byte varByte = Byte.valueOf("50");
   int varInteger = Integer.valueOf("100");
   Untuk mengetahui lebih detail tentang class Scanner dan method-methodnya 
   baca di : https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBR 
{
 public static void main(String[] args) throws IOException 
 {
  // Membuat objek inputstream & objek bufferreader
  InputStreamReader isr = new InputStreamReader(System.in); // baris 1
  BufferedReader br = new BufferedReader(isr);              // baris 2
  /* dua baris perintah di atas (baris 1 dan baris 2) dapat dijadikan satu baris perintah sbb:
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  */

  String nama;
  int umur;
  System.out.println("===== Program Nginput Data =====");
  System.out.println("===== Memasukan Data =====");
  try
  {
   //Memasukkan data dari keyboard
   System.out.print("Nama Lengkap   : ");
   nama = br.readLine();
   System.out.print("Umur           : ");
   /* untuk konversi data string angka ke angka bisa memakai salah perintah berikut
      umur = Integer.parseInt(br.readLine());
      umur = Integer.valueOf(br.readLine());
   */
   umur = Integer.valueOf(br.readLine());
   //Menampilkan Data ke Layar Monitor 
   System.out.println("\n===== Menampilkan Data =====");
   System.out.println("Nama Lengkap   : " + nama);
   System.out.println("Umur           : " + umur + " Tahun");
  } catch(IOException ex)
  {
   // Jika ada kesalahan ketika menginputkan data
   System.out.println("Terjadi Kesalahan pada Input");
  }
 }
}


