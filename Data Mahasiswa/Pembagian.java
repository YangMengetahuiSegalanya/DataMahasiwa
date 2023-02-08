import java.util.Scanner;
public class Pembagian 
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner (System.in);
  //Meminta user untuk memasukkan dua angka integer
  System.out.println("Masukkan dua buah integer: ");
  System.out.print("Masukkan integer ke 1 : ");
  int angka1 = input.nextInt();
  System.out.print("Masukkan integer ke 2 : ");
  int angka2 = input.nextInt();
  System.out.println("Hasil dari " + angka1 + " dibagi " + angka2 + " adalah: " + (angka1/angka2));
 }
}