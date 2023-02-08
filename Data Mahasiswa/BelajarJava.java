class BelajarJava 
{ 
 public static void main(String args[])
 {
  int a = 10, b = 10, c;
  System.out.println("Isi awal variabel a: " + a );
  System.out.println("Isi awal variabel b: " + b );
  c = ++a + b++;
  System.out.println("Isi variabel a setelah increment : " + a );
  System.out.println("Isi variabel b setelah increment : " + b );
  System.out.println("Isi variabel c hasil penjumlahan : " + c );
  c = a + b;
  System.out.println("Isi variabel c hasil penjumlahan : " + c );
  }
}