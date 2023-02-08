/* Contoh Program Class String
   contoh-contoh program pemakaian construktor dan method dalam class String
   by Totok S
   Yogyakarta, September 2021
   field String
   

   construktor String
    1. String()
    2. String(byte[] bytes)
    3. String(byte[] bytes, Charset charset)
    4. String(byte[] ascii, int hibyte) => tidak digunakan lagi
    5. String(byte[] bytes, int offset, int length)
    6. String(byte[] bytes, int offset, int length, Charset charset)
    7. String(byte[] ascii, int hibyte, int offset, int count) => tidak digunakan lagi
    8. String(byte[] bytes, int offset, int length, String charsetName)
    9. String(byte[] bytes, String charsetName)
   10. String(char[] value)
   11. String(char[] value, int offset, int count)
   12. String(int[] codePoints, int offset, int count)
   13. String(String original)
   14. String(StringBuffer buffer)
   15. String(StringBuilder builder)

method String
01.   void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
02.   boolean contains(CharSequence s)
03.   boolean contentEquals(CharSequence cs)
04.   boolean contentEquals(StringBuffer sb)
05.   boolean endsWith(String suffix)
06.   boolean equals(Object anObject)
07.   boolean equalsIgnoreCase(String anotherString)
08.   boolean isEmpty()
09.   boolean matches(String regex)
10.   boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
11.   boolean regionMatches(int toffset, String other, int ooffset, int len)
12.   boolean startsWith(String prefix)
13.   boolean startsWith(String prefix, int toffset)
14.   char charAt(int index)
15.   CharSequence subSequence(int beginIndex, int endIndex)
16.   char[] toCharArray()
17.   byte[] getBytes()
18.   byte[] getBytes(Charset charset)
19.   byte[] getBytes(String charsetName)
20.   int codePointAt(int index)
21.   int codePointBefore(int index)
22.   int codePointCount(int beginIndex, int endIndex)
23.   int compareTo(String anotherString)
24.   int compareToIgnoreCase(String str)
25.   int hashCode()
26.   int indexOf(int ch)
27.   int indexOf(int ch, int fromIndex)
28.   int indexOf(String str)
29.   int indexOf(String str, int fromIndex)
30.   int lastIndexOf(int ch)
31.   int lastIndexOf(int ch, int fromIndex)
32.   int lastIndexOf(String str)
33.   int lastIndexOf(String str, int fromIndex)
34.   int length()
35.   int offsetByCodePoints(int index, int codePointOffset)
36.   String concat(String str)
37.   static String copyValueOf(char[] data)
38.   static String copyValueOf(char[] data, int offset, int count)
39.   static String format(Locale l, String format, Object... args)
40.   static String format(String format, Object... args)
41.   String intern()
42.   String replace(char oldChar, char newChar)
43.   String replace(CharSequence target, CharSequence replacement)
44.   String replaceAll(String regex, String replacement)
45.   String replaceFirst(String regex, String replacement)
46.   String[] split(String regex)
47.   String[] split(String regex, int limit)
48.   String substring(int beginIndex)
49.   String substring(int beginIndex, int endIndex)
50.   String toLowerCase()
51.   String toLowerCase(Locale locale)
52.   String toString()
53.   String toUpperCase()
54.   String toUpperCase(Locale locale)
55.   String trim()
56.   static String valueOf(boolean b)
57.   static String valueOf(char c)
58.   static String valueOf(char[] data)
59.   static String valueOf(char[] data, int offset, int count)
60.   static String valueOf(double d)
61.   static String valueOf(float f)
62.   static String valueOf(int i)
63.   static String valueOf(long l)
64.   static String valueOf(Object obj)
*/
//import java.util.Scanner;
public class ContohString
{
 public static void main(String args[]) 
 {
  //Scanner input = new Scanner(System.in);
  //String nama = input.nextLine();
  byte ascii[] = {65,66,67,68,69,70,71,72,73,74,75};
  String str1 = new String(ascii);//constructor => 2 String(byte[] bytes) 
  String str2 = new String(ascii,2,3);//constructor => 5 String(byte[] bytes, int offset, int length) 
  System.out.println(str1);//=>|ABCDEFGHIJK|
  System.out.println(str2);//=>|CDE|
  char[] haloArray = { ' ', 'h', 'a', 'l', 'o', ' ', 'j','a', 'v', 'a', ' ' };
  String haloString = new String(haloArray); //constructor => 10 String(char[] value) 
  System.out.println(haloString);//=>| halo java |
  String palindrome = "kasur ini rusak";
  String kal1 = "Selamat Belajar!"; 
  String kal2 = "Selamat Belajar!";
  boolean k1 = kal1.contentEquals(kal2);//method => 03 boolean contentEquals(CharSequence cs) 04. boolean contentEquals(StringBuffer sb)
  boolean k2 = kal1.contentEquals(haloString);//method => 03 boolean contentEquals(CharSequence cs) 04. boolean contentEquals(StringBuffer sb)
  char kar = palindrome.charAt(7); //method => 14 Mengetahui karakter pada index ke-7 : n
  int nilai = palindrome.codePointAt(7);//method => 20 Menentukan unicode pada indeks tertentu, indeks 7 : n = 110 
  int result = kal1.compareTo(kal2);//method => 23 membandingkan String dengan object lain atau dua string lesikografi 
  int pjkal = palindrome.length(); //method => 34 Mengetahui jumlah karakter string : 15  
  String gabungan = haloString.concat(kal1); //method => 36 Menggabungkan string :| halo java Selamat Belajar!|
  String str = kal1.copyValueOf(haloArray);//method => 37 
  System.out.println(k1);//true
  System.out.println(k2);//false
  System.out.println("Karakter string pada index ke 7 adalah " + kar); //n
  System.out.println("Unicode karakter n pada index 7 dari kalimat kasur ini rusak adalah: " + nilai);//110
  System.out.println( "Panjang atau jumlah karakter String adalah : " + pjkal);//15
  System.out.println(result);//0
  result = kal2.compareTo(palindrome);
  System.out.println(result);//-24
  result = palindrome.compareTo(kal1);
  System.out.println(result);//24
  System.out.println(str);//halo java
  System.out.println(gabungan); //| halo java Selamat Belajar!|
  System.out.println(gabungan.toLowerCase()); //method => 50 Membuat string menjadi huruf kecil:| halo java selamat belajar!|
  System.out.println(gabungan.toUpperCase()); //method => 53 Membuat string menjadi huruf kapital:| HALO JAVA SELAMAT BELAJAR!|  
  System.out.println("Setelah menggunakan method trim: "); 
  System.out.println(gabungan.trim()); //method => 55 Menghilangkan spasi di awal & akhir kalimat:|halo java Selamat Belajar!|
 }
}