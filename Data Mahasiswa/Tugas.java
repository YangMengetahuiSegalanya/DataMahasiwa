import java.util.Scanner;
public class Tugas{ 
public static void main (String[] args)
{
//Mendeklarasikan konstanta
final String NAMA = "Surya Agung Saputra";
final boolean CEK = true;
 //Mendeklarasikan variabel
String kata; 
Long nim;
Long telp;
String alamat;
//Memasukkan data
System.out.printf("Masukan Nama Anda :");
Scanner kal = new Scanner(System.in);
kata = kal.nextLine();

System.out.printf("Masukan NIM Anda :");
Scanner nomor = new Scanner(System.in);
nim = nomor.nextLong();

System.out.printf("Masukan Nomor Telepon Anda :");
Scanner telpon = new Scanner(System.in);
telp = telpon.nextLong();

System.out.printf("Masukan Alamat Anda :");
Scanner alm = new Scanner(System.in);
alamat = alm.nextLine();
 //Menampilkhan pesan dan data isi variabel 
System.out.printf("     ");
System.out.printf("Halo" + NAMA);
System.out.printf("Berikut Biodata Anda :");
System.out.printf("Nama : " + kata);
System.out.printf("NIM : " + nim);
System.out.printf("Nomor Telepon : " + telp);
System.out.printf("Alamat : " + alamat);
}
}
