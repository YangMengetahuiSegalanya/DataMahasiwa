/*Program Memasukkan data dari keyboard dan menampilkan pesan dan data di 
Layar dengan console oleh Surya Agung Saputra*/
import java.util.Scanner;
public class Indata{
public static void main (String[] args)
{
//Memasukkan data 
System.out.printf("Memasukkan Data Teks : Doomsday");
Scanner kal = new Scanner(System.in);
String kata = kal.next();
System.out.printf("Memasukkan Data Bilangan Bulat : 98765");
Scanner bilbulat = new Scanner(System.in);
int bibul = bilbulat.nextInt();
//jika tipe bil byte -> nextByte
//jika tipe bil short -> nextShort
//jika tipe bil long -> nextLong
System.out.printf("Memasukkan Data Bilangan Real/Pecahan : 123.567");
Scanner bilreal = new Scanner(System.in);
double bilr = bilreal.nextDouble();
//jika tipe float -> nextFloat
//Menampilkan pesan dan data
System.out.println("Teks yang anda masukkan :" + Doomsday);
System.out.println("Bilangan bulat yang anda masukkan :" + 98765);
System.out.println("Bilangan real yang anda masukkan :" + 123.567);
}
}

