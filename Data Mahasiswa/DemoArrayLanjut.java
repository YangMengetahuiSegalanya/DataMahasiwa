/* Looping ForEach
   digunakan secara eksklusif untuk melakukan loop melalui elemen dalam array.
   JDK 1.5 memperkenalkan loop for baru yaitu loop foreach atau loop for yang disempurnakan, 
   dipakai untuk melintasi larik lengkap secara berurutan tanpa menggunakan variabel indeks. 
   Dengan sintaks :
   for (type variable : arrayname) {...}
   Kelas java.util.Arrays berisi berbagai metode statis untuk mengurutkan dan mencari array, 
   membandingkan array, dan mengisi elemen array. 
   Metode ini kelebihan beban untuk semua tipe primitif.
   public static int binarySearch(Object[] a, Object key) 
   => Mencari array tertentu dari Object (Byte, Int, double, dan lainnya) 
      Untuk nilai yang ditentukan menggunakan algoritma pencarian biner. 
      Larik harus diurutkan sebelum melakukan panggilan ini. 
      mengembalikan indeks dari kunci pencarian, jika terdapat dalam daftar dan 
      jika tidak, ia mengembalikan (- (titik penyisipan + 1)).
   public static boolean equals(long[] a, long[] a2) 
   => Mengembalikan nilai benar jika dua array dengan panjang yang sama. 
      Dua array sama jika kedua array berisi jumlah elemen yang sama dan 
      semua pasangan elemen yang sesuai dalam dua array sama. 
      mengembalikan nilai true jika dua larik sama. 
      dapat digunakan oleh semua tipe data primitif lainnya (Byte, short, Int, dan lainnya).
   public static void fill(int[] a, int val) 
   => menetapkan nilai int yang ditentukan ke setiap elemen dari array int yang ditentukan. 
      dapat digunakan oleh semua tipe data primitif lainnya (Byte, short, Int, dan lainnya).
   public static void sort(Object[] a) 
   => mengurutkan array objek yang ditentukan ke dalam urutan naik, 
      sesuai dengan urutan alami elemennya. 
      dapat digunakan oleh semua tipe data primitif lainnya (Byte, short, Int, dan lainnya).
   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
   => menyalin array ke array lain

*/

//import java.util.Arrays; 
import java.util.Collections;

public class DemoArrayLanjut 
{
 static void min(int arr[])
 {  
  int min=arr[0];  
  for(int i=1;i<arr.length;i++) if(min>arr[i]) min=arr[i];  
  System.out.println(min);  
 } 
 public static void printArray(int[] array) 
 {
  for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
 }
 public static int[] reverse(int[] list) 
 {
  int[] result = new int[list.length];
  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) result[j] = list[i];
  return result;
 }
 static int[] get()
 {  
  return new int[]{10,30,50,90,60};  
 }
 public static void main(String[] args) 
 {
  //deklarasi dan inisialisasi array
  int a[]=get();
  int arr[]={33,3,4,5};
  int carr[]=arr.clone();//membuat tiruan array
  double[] myList = {1.9, 2.9, 3.4, 3.5};
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  //deklarasi array sumber  
  char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  
  //deklarasi array tujuan  
  char[] copyTo = new char[7]; 
  // Menampilkan semua elemen array dengan foreach
  for(int b=0;b<a.length;b++) System.out.print(a[b] + " ");System.out.println();
  for(int c : a) System.out.print(c + " ");System.out.println();  
  for(int i : arr) System.out.print(i + " ");System.out.println();
  if(arr==carr) System.out.println("arr = carr");else System.out.println("arr != carr");
  if(arr.equals(carr)) System.out.println("arr equal carr");else System.out.println("arr no equal carr");
  System.out.println("Apakah array arr dan carr equal? " + java.util.Arrays.equals(arr, carr)); 
  System.out.println("Apakah array a dan arr equal? " + java.util.Arrays.equals(a, arr));
  for(int j : carr) System.out.print(j + " ");System.out.println();
  for (double e : myList) System.out.print(e + " ");System.out.println();
  for (String s : cars) System.out.print(s + " ");System.out.println();
  // Memanggil method
  min(arr);//passing array to method 
  printArray(new int[]{3, 1, 2, 6, 4, 2});//passing anonymous array to method 
  System.out.println();
  for(int c : a) System.out.print(c + " ");System.out.println();
  int[] y = reverse(a);
  for(int c : y) System.out.print(c + " ");System.out.println();
  //menyalin array memakai method arraycopy()   
  System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
  System.out.println();
  // Menampilkan array tujuan  
  System.out.println(String.valueOf(copyTo));  

  //Menggunakan method sort dari class Arrays 
  //Arrays.sort(arr); //jika dengan import java.util.Arrays
  java.util.Arrays.sort(arr);//jika tanpa import java.util.Arrays
  java.util.Arrays.sort(copyFrom, 3, 7); 
  //Menampilkan Array 
  for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " "); 
  System.out.println();
  Integer[] dar = { 13, 7, 6, 45, 21, 9, 2, 100 }; 
  java.util.Arrays.sort(dar, Collections.reverseOrder());
  System.out.printf("Modifikasi dar[] : %s", java.util.Arrays.toString(dar));
  System.out.println();
  for (int i = 0; i < copyFrom.length; i++) System.out.print(copyFrom[i] + " ");
  //Menggunakan method parallelSort dari class Arrays untuk di jdk versi menengah ke atas 
  java.util.Arrays.parallelSort(copyFrom, 3, 7); 
  //Menampilkan Array 
  for (int i = 0; i < copyFrom.length; i++) System.out.print(copyFrom[i] + " "); 
  //Menggunakan method binarySearch dari class Arrays 
  System.out.println("\nAngka 3 terdapat di index ke " + java.util.Arrays.binarySearch(arr, 3)); 
  System.out.println("Angka 15 terdapat di index ke " + java.util.Arrays.binarySearch(arr, 15));//Jika key tidak ditemukan dalam array, maka method mengembalikan nilai -(insertionIndex + 1).
  //Memasukkan 15 ke array carr 
  java.util.Arrays.fill(carr, 15); 
  //Menampilkan Array carr 
  for (int i = 0 ; i < carr.length; i++) System.out.print(carr[i] + " ");
  System.out.println();
  //Memasukkan 10 ke array carr[1] sampai carr [3-1] 
  java.util.Arrays.fill(carr, 1, 3, 10); 
  //Menampilkan Array 
  for (int i = 0 ; i < carr.length; i++) System.out.print(carr[i] + " ");
  System.out.println();
  //Menampilkan elemen array dengan method toString
  System.out.print(java.util.Arrays.toString(carr));
 }
}
