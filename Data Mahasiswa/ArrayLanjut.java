/* Looping ForEach
   digunakan secara eksklusif untuk melakukan loop melalui elemen dalam array.
   JDK 1.5 memperkenalkan loop for baru yaitu loop foreach atau loop for yang disempurnakan, 
   dipakai untuk melintasi larik lengkap secara berurutan tanpa menggunakan variabel indeks. 
   Dengan sintaks :
   for (type variable : arrayname) {...}

*/

public class ArrayLanjut
{
 public static void main(String[] args)
 {
  String nama[] = {"Budi","Tono","Amir","Adit","Restu"};
  for(int i = 0; i < nama.length; i++) System.out.println("Nama ke " + i + " = " + nama[i]);
  for(String s : nama) System.out.println(s);
 }
}