/*Memprintf tampilan ouput dengan method PrintStream => printf 
  Secara internal, printf() menggunakan kelas java.util.printfter 
  untuk mengurai string printf dan menghasilkan output. 
  System.out.printf(printf, arguments);
  System.out.printf(locale, printf, arguments);
  parameter locale => Locale.US, Locale.ITALY, dsb.
  parameter printf diawali dengan %
  Aturan printf
  terdiri dari literal dan penentu printf
  %tanda, lebar, presisi, dan karakter konversi dalam urutan
  %[flags][width][.precision]conversion-character
  tanda kurung adalah opsional
  flags      : untuk memprintf bilangan bulat dan angka floating-point.
  width      : menentukan lebar bidang untuk mengeluarkan argumen, 
               mewakili jumlah minimum karakter yang ditulis ke output.
  .precision : menentukan jumlah digit presisi saat mengeluarkan nilai floating-point atau 
               untuk menentukan panjang substring yang akan diekstrak dari sebuah String.
  %a : hexa dari bil pecahan xabcdefp, %A : XABCDEFP 
  %b : boolean true/false, %B : TRUE/FALSE
  %c : karakter 'a',       %C : 'A'  
  %d : bil bulat
       ("|%20d|", 93);                   => |                  93|
       ("|%-20d|", 93);                  => |93                  | 
       ("|%020d|", 93);                  => |00000000000000000093|
       ("%d%n", 10000L);                 => 10000
       ("|%,d|", 10000000);              => |10,000,000|
       ("|%(d|", -36);                   => |(36)|
       (Locale.US, "%,d %n", 10000);     => 10,000
       (Locale.ITALY, "%,d %n", 10000);  => 10.000 
  %e : bil pecahan notasi standar scientifik => %5.2e dari 5.1473 = 5.15e+00
  %f : bil pecahan =>%5.2f (dalam lebar 5 digit/karakter dibelakang . ada 2 digit/karakter)
  %g : bil pecahan dalam notasi ilmiah tergantung pada presisi dan nilai.
  %h : Hex String nilai dari method hashCode(), bisa hexa bulat atau desimal.
  %n : ganti baris
  %o : bil oktal ("|%o|"), 93) => 135, ("|%#o|", 93) => 0135; 
  %s : string => %5s (5 karakter rata kanan), %-5s (5 karakter rata kiri), %3.5s (3 karakter pertama dari 5 karakter)
       ("|%30s|", "Hello World")  => | Hello World|
       ("|%-30s|", "Hello World") => |Hello World |
       ("|%.5s|", "Hello World")  => |Hello|
       ("|%30.5s|", "Hello World")=> | Hello|
  %t : nilai tanggal/jam => %ta (hari disingkat), %tA (hari), %tb (bln disingkat) = %th, %tB (bln), 
       %tc (%ta %tb %td %tT %tZ %tY” e.g. Fri Feb 17 07:45:42 PST 2017), %tC (th 00-99), 
       %td (hari 01-31), %tD (%tm/%td/%ty), %te (hari 1-31), %tF (%tY-%tm-%td),
       %tH (jam 00-23), %tI (jam 01-12), %tj (hari 001-366), %tk (jam 0-23), %tl (jam 1-12),
       %tm (bln 01-12), %tM (menit 00-59), %tN (nanodetik 0000000000-999999999), %tp (am atau pm),
       %tQ (milidetik), %tr (%tI:%tM:%tS %Tp), %tR (%tH:%tM), %ts (detik), %tS (detik 00-59), 
       %tT (%tH:%tM:%tS), %ty (tahun 00-99), %tY (tahun 00-99), %tz (zona waktu GMT -0800), %tZ (singkatan zona waktu UTC, PST, dsb)
       ("%tT%n", date) => 13:51:15
       ("hours %tH: minutes %tM: seconds %tS%n", date, date, date) => hours 13: minutes 51: seconds 15
       ("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date) => 13:51:15 pm 061 061000000 +0400
       ("%1$tA, %1$tB %1$tY %n", date)=> Thursday, November 2018
       ("%1$td.%1$tm.%1$ty %n", date) => 22.11.18
  %x : String hexa bulat ("|%x|", 93) => 5d, ("|%#x|", 93) => 0x5d
, ("|%#X|", 93) => 0X5D
*/

import java.util.Calendar;
import java.util.Locale;
public class ContohPrinf
{
 static public void main(String[] args) 
 {
  boolean a = true;
  char huruf = 'a';
  long n = 30091967;
  double pi = Math.PI;
  Calendar c = Calendar.getInstance();
  String alamat = "Mlati Dukuh, Sendangadi, Mlati, Sleman";
  //printf bilangan hexadesimal
  System.out.printf("%a  %A%n", pi, pi);        //--> 0x1.921fb54442d18p1  0X1.921FB54442D18P1
  System.out.printf("%19h %20h%n", n, pi);      //-->             1cb2abf             144d0ce3
  System.out.printf("|%x| |%X|%n", n, n);       //--> |1cb2abf| |1CB2ABF|
  System.out.printf("|%20x|%n", n);             //--> |             1cb2abf|
  System.out.printf("|%#20x|%n", n);            //--> |           0x1cb2abf|
  System.out.printf("|%#20X|%n%n", n);          //--> |           0X1CB2ABF|

  //printf bilangan Oktal
  System.out.printf("|%o%n|", n);               //--> |162625277|
  System.out.printf("|%20o|%n%n", n);           //--> |           162625277|
  
  //printf Boolean
  System.out.printf("%b  %B%n%n", a, a);          //--> true  TRUE

  //printf Karakter
  System.out.printf("%c  %C%n%n", huruf, huruf);//--> a  A

  //printf Bilangan bulat
  System.out.printf("|%20d|%n", n);             // => |            30091967|
  System.out.printf("|%-20d|%n", n);            // => |30091967            | 
  System.out.printf("|%020d|%n", n);            // => |00000000000030091967|
  System.out.printf("%d%n", n);                 // => 30091967
  System.out.printf("|%,20d|%n", n);            // => |          30,091,967|
  System.out.printf("|%(20d|%n", -n);           // => |          (30091967)|
  System.out.printf(Locale.US, "%,d %n", n);    // => 30,091,967
  System.out.printf(Locale.ITALY, "%,d %n", n); // => 30.091.967
  System.out.printf(Locale.FRANCE, "%,d %n", n);// => 30,091,967 
  System.out.printf("|%+20d|%n", n);            //--> |           +30091967|
  System.out.printf("|%+,20d|%n%n", n);         //--> |         +30,091,967|

  //printf bilangan pecahan
  System.out.printf("|%e|%n", pi);              //--> |3.141593e+00|
  System.out.printf("|%f|%n", pi);              //--> |3.141593|
  System.out.printf("|%g|%n", pi);              //--> |3.14159| 
  System.out.printf("|%20e|%n", pi);            //--> |        3.141593e+00|
  System.out.printf("|%20f|%n", pi);            //--> |            3.141593|
  System.out.printf("|%20g|%n", pi);            //--> |             3.14159|
  System.out.printf("|%+20e|%n", pi);           //--> |       +3.141593e+00|
  System.out.printf("|%+20f|%n", pi);           //--> |           +3.141593|
  System.out.printf("|%+20g|%n", pi);           //--> |            +3.14159|
  System.out.printf("|%-20e|%n", pi);           //--> |3.141593e+00        |
  System.out.printf("|%-20f|%n", pi);           //--> |3.141593            |
  System.out.printf("|%-20g|%n", pi);           //--> |3.14159             |
  System.out.printf("|%.3e|%n", pi);            //--> |3.142e+00|
  System.out.printf("|%.3f|%n", pi);            //--> |3.142|
  System.out.printf("|%.3g|%n", pi);            //--> |3.14|
  System.out.printf("|%20.2e|%n", pi);          //--> |            3.14e+00|
  System.out.printf("|%20.2f|%n", pi);          //--> |                3.14|
  System.out.printf("|%20.2g|%n", pi);          //--> |                 3.1|
  System.out.printf("|%-20.2e|%n", pi);         //--> |3.14e+00            |
  System.out.printf("|%-20.2f|%n", pi);         //--> |3.14                |
  System.out.printf("|%-20.2g|%n", pi);         //--> |3.1                 |
  System.out.printf(Locale.US, "%20.4e %n", pi);    // =>         3.141593e+00
  System.out.printf(Locale.ITALY, "%20.4f %n", pi); // =>               3.1416
  System.out.printf(Locale.FRANCE, "%20.4g %n%n", pi);// =>                3.142
  
  //printf String
  System.out.printf("|%s|%n", alamat);      // => |Mlati Dukuh, Sendangadi, Mlati, Sleman|
  System.out.printf("|%50s|%n", alamat);    // => |            Mlati Dukuh, Sendangadi, Mlati, Sleman|
  System.out.printf("|%-50s|%n", alamat);   // => |Mlati Dukuh, Sendangadi, Mlati, Sleman            |
  System.out.printf("|%.4s|%n", alamat);    // => |Mlati|
  System.out.printf("|%50.11s|%n%n", alamat); // =>|Mlati Dukuh                                      | 

  //printf Date tanggal-jam
  System.out.printf(" ta : %ta%n tb : %tb%n tc : %tc%n td : %td%n te : %te%n", c, c, c, c, c);// => Sat => Nov => Sat Nov 13 13:28:47 ICT 2021 => 13 => 13
  System.out.printf(" tj : %tj%n tk : %tk%n tl : %tl%n tm : %tm%n tp : %tp%n", c, c, c, c, c);// => 313 => 13 => 1 => 11 => pm
  System.out.printf(" tr : %tr%n ts : %ts%n ty : %ty%n tz : %tz%n", c, c, c, c);// => 01:28:47 PM => 1636784927 => 21 => +0700
  System.out.printf(" tA : %tA%n tB : %tB%n tC : %tC%n tD : %tD%n tF : %tF%n", c, c, c, c, c);// =>Saturday => November => 20 => 11/13/21 => 2021-11-13
  System.out.printf(" tH : %tH%n tI : %tI%n tM : %tM%n tN : %tN%n tQ : %tQ%n", c, c, c, c, c);// => 13 => 01 => 28 => 279000000 => 1636784927279
  System.out.printf(" tR : %tR%n tS : %tS%n tT : %tT%n tY : %tY%n tZ : %tZ%n", c, c, c, c, c);// =>13:28 => 47 => 13:28:47 => 2021 => ICT
  System.out.printf("%tB %te, %tY%n", c, c, c); // --> November 13, 2021
  System.out.printf("%tl:%tM %tp%n", c, c, c);  // --> 1:28 pm
  System.out.printf("hours %tH: minutes %tM: seconds %tS%n", c, c, c);// => hours 13: minutes 28: seconds 47
  System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", c);// => 13:28:47 pm 279b279000000 +0700
  System.out.printf("%1$tA, %1$tB %1$tY %n", c);// => Saturday, November 2021
  System.out.printf("%1$td.%1$tm.%1$ty %n", c);// => 13.11.21

 }
}


