import java.util.Scanner;
public class PembagianDenganException 
{
 //Method static untuk menghitung hasil pembagian
 public static int hitungPembagian(int angka1, int angka2)
 {
  if(angka2 == 0)
  {
   throw new ArithmeticException("Angka pembagi tidak boleh nol!");
  }
  return (angka1/angka2);
 }

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  //Meminta user untuk memasukkan dua angka integer
  System.out.println("Masukkan dua buah integer: ");
  System.out.print("Masukkan integer ke 1 : ");
  int angka1 = input.nextInt();
  System.out.print("Masukkan integer ke 2 : ");
  int angka2 = input.nextInt();
  try
  {
   int hasil = hitungPembagian(angka1, angka2);
   System.out.println("Hasil dari " + angka1 + " dibagi " + angka2 + " adalah: " + hasil);
  }
  catch (ArithmeticException exception)
  {
   System.out.println("Exception: Suatu integer " + "tidak dapat dibagi oleh nol!");
  }
  System.out.println("Eksekusi program dilanjutkan ...");
 }
}