/* Program Memasukkan data dari keyboard
 Menampung di variabel kemudian menampilkan pesan 
 dan isi variabel di Layar
 dengan console oleh Surya Agung Saputra */
import java.util.Scanner;
public class Invardata{ 
public static void main (String[] args)
{
 //Mendeklarasikan konstanta
 final double PI = 3.14;
 final String NAMA = "Surya";
 final boolean CEK = true;
 //Mendeklarasikan variabel
 String kata;
 int bil_bul;
 double bil_pec;
 //Memasukkan data
 System.out.printf("Masukkan sebuah kata ucapan :");
 Scanner keyboard = new Scanner(System.in);
 kata = keyboard.next(); //proses memasukkan kata ucapan ke variabel kata
 System.out.printf("Masukkan sebuah bilangan bulat :");
 Scanner bilbulat = new Scanner(System.in);
 bil_bul = keyboard.nextInt(); //proses memasukkan bil. bulat ke variabel bil_bul
 /* jika tipe bil byte -> nextByte
 jika tipe bil short -> nextShort
 jika tipe bil long -> nextLong */
 System.out.printf("Masukkan sebuah bilangan pecahan :");
 Scanner bilreal = new Scanner(System.in);
 bil_pec = keyboard.nextDouble(); //proses memasukkan bil. bulat ke variabel bil_bul
 //jika tipe float -> nextFloat
 //Menampilkan pesan dan data isi variabel 
 System.out.println(kata + NAMA);
 System.out.println("Bilangan bulat yang anda masukkan :" + bil_bul);
 System.out.println("Bilangan real yang anda masukkan :" + bil_pec);
 System.out.println("Pernyataan tersebut di atas adalah : " + CEK);
}
}
