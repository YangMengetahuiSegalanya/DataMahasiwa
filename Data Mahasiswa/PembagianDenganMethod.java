import java.util.Scanner;
public class PembagianDenganMethod 
{
 //Method static untuk menghitung hasil pembagian
 public static int HitungPembagian(int angka1, int angka2)
 {
  if(angka2 == 0)
  {
   System.out.println("Angka pembagi tidak boleh nol!");
   System.exit(1);
  }
  return (angka1/angka2);
 }
	
 public static void main(String[] args) 
 {
  Scanner input = new Scanner (System.in);
  //Meminta user untuk memasukkan dua angka integer
  System.out.println("Masukkan dua buah integer: ");
  System.out.print("Masukkan integer ke 1 : ");
  int angka1 = input.nextInt();
  System.out.print("Masukkan integer ke 2 : ");
  int angka2 = input.nextInt();
  int hasil = HitungPembagian(angka1, angka2);
  System.out.println("Hasil dari " + angka1 + " dibagi " + angka2 + " adalah: " + hasil);
 }
}