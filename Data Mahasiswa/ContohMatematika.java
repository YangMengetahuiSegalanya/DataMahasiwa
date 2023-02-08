/* Contoh Program Class Math
   contoh-contoh program pemakaian method dalam class Math
   by Totok S
Yogyakarta, September 2021
konstanta dalam class Math 
01.Math.E => e = 2.71...
02.Math.PHI => PHI = 3.14...
method atau Fungsi Matematika dalam class Math
01.Math.abs() => nilai absolute -> positip
   public static int abs(int i)  
   public static double abs(double d)  
   public static float abs(float f)  
   public static long abs(long lng) 
02.Math.ceil() => bulatkan ke atas
   public static double ceil(double x)  
03.Math.floor() => bulatkan ke bawah
   public static double floor(double a)  
04.Math.floorDiv() => floor dari hasil bagi x/y
   public static int floorDiv(int x, int y)  
   public static long floorDiv(long x, int y)  
   public static long floorDiv(long x, long y) 
05.Math.rint() => bulat ke bawah <=0.5 dan bulatkan ke atas > 0.5
   public static double rint(double x)  
06.Math.round() => bulat ke bawah < 0.5 dan bulatkan ke atas >= 0.5
   public static int round(float x)  
   public static long round(double x)  
07.Math.signum() => bil positip : 1, nol : 0, negatip : -1, NaN :NaN
   public static double signum(double x)  
   public static float signum(float x)
08.Math.copySign() => salin tanda b ke tanda a
   public static double copySign(double a, double b)  
   public static float copySign(float a, float b)
09.Math.negateExact() => return negate/kebalikan tanda dari a (+ => - atau - => +)
   public static int negateExact (int a)   
   public static long negateExact (long a) 
10.Math.nextUp() => perluas nilai a dibelakang komanya sehingga > a ttp kalau dibulatkan = a
   public static double nextUp(double a)  
   public static float nextUp(float a)
11.Math.nextDown() => perluas nilai a dibelakang komanya sehingga < a ttp kalau dibulatkan = a
   public static double nextDown(double a)  
   public static float nextDown(float a) 
12.Math.nextAfter() => return a
   public static double nextAfter(double a, double b)  
   public static float nextAfter(float a, double b)
13.Math.toIntExact() => return a atau exception
   public static int toIntExact (long a) 
14.Math.IEEEremainder() => return a - (b x n), n = a/b bulat atau n = a div b
   public static double IEEEremainder(double a, double b)
15.Math.random() => bil random 0<r<1
   public static double random( )
16.Math.min()
   public static int min(int a, int b)  
   public static double min(double a, double b)  
   public static long min(long a, long b)  
   public static float min(float a, float b)  
17.Math.max() 
   public static int max(int a, int b)  
   public static double max(double a, double b)  
   public static long max(long a, long b)  
   public static float max(float a, float b) 
18.Math.incrementExact() => return a + 1 atau exception
   public static int incrementExact (int a)   
   public static long incrementExact (long a)  
19.Math.decrementExact() => return a-1 atau exception
   public static int DecrementExact (int a)   
   public static long decrementExact (long a)  
20.Math.addExact() => return a + b atau exception
   public static int addExact(int a, int b)   
   public static long addExact(long a, long b)  
21.Math.subtractExact() => return a - b atau exception
   public static int subtractExact(int a, int b)   
   public static long subtractExact(long a, long b)  
22.Math.multiplyExact() => return a x b atau exception
   public static int multiplyExact(int a, int b)   
   public static long multiplyExact(long a, long b)  
   public static long multiplyExact(long a, int b)  
23.Math.pow() => pangkat a^b
   public static double pow(double a, double b)  
24.Math.sqrt() => akar kuadrat
   public static double sqrt(double x)  
25.Math.cbrt() => akar kubik
   public static double cbrt(double x) 
26.Math.hypot() => akar dari x^2 + y^2
   public static double hypot(double x, double y)  
27.Math.ulp() => mengembalikan ukuran ulp argumen, ulp: the unit in the last place / unit di tempat terakhir.
                 ulp dari float atau nilai ganda : jarak positif antara nilai yang diberikan dan nilai berikutnya yang lebih besar 
   public static double ulp(double x)  
   public static float ulp(float x)  
28.Math.getExponent() => return 2 log x (log x dengan basis 2)
   public static int getExponent(float x)  
   public static int getExponent(double x)  
29.Math.log() => return e log x (log x dengan basis e=2.71)
   public static double log(double x)  
30.Math.log10() => return 10 log x (log x dengan basis 10)
   public static double log10(double x)  
31.Math.log1p() => return ln (x+1)
   public static double log1p(double x)  
32.Math.exp() => return e^x (e = 2.71)
   public static double exp(double x)  
33.Math.expm1() => return (e^x)-1 (e = 2.71)
   public static double expm1(double x)  
34.Math.sin() => a dalam derajat, return -1 s/d 1
   public static double sin(double a)  
35.Math.cos() => a dalam derajat, return -1 s/d 1
   public static double cos(double a) 
36.Math.tan() => a dalam derajat, return NaN s/d NaN (tak terhingga)
   public static double tan(double a) 
37.Math.asin() => return -PI/2 s/d PI/2
   public static double asin(double a)  
38.Math.acos() => return 0 s/d PI
   public static double acos(double a)  
39.Math.atan() => return -PI/2 s/d PI/2
   public static double atan(double a)
40.Math.sinh() => return (e^x - e^-x)/2
   public static double sinh(double x)  
41.Math.cosh() => return (e^x - e^-x)/2
   public static double cosh(double x) 
42.Math.tanh() => return ((ex - e -x)/2) / ((ex + e -x)/2)
   public static double tanh(double x)  
43.Math.toDegrees => return derajat, x : radian (x = PI:3.14 => 180)
   public static double toDegrees(double x)  
44.Math.toRadians => return radian, x : derajat (x = 180 => PI:3.14)
   public static double toRadians(double x) 
*/

//import java.util.Scanner;
public class ContohMatematika
{
 public static void main(String args[]) 
 {
  //Scanner input = new Scanner(System.in);
  //String nama = input.nextLine();
  //double n = 123.456;
  //int m, y = 987;
  System.out.printf("Math.E           = %f%nMath.PI          = %f%n",Math.E,Math.PI);
  System.out.printf("Math.abs   -2.25 = %5.2f%nMath.abs   -2.50 = %5.2f%nMath.abs   -2.75 = %5.2f%nMath.abs    2.25 = %5.2f%nMath.abs    2.50 = %5.2f%nMath.abs    2.75 = %5.2f%n",
  Math.abs(-2.25),Math.abs(-2.50),Math.abs(-2.75),Math.abs(2.25),Math.abs(2.50),Math.abs(2.75));  
  System.out.printf("Math.ceil  -2.25 = %5.2f%nMath.ceil  -2.50 = %5.2f%nMath.ceil  -2.75 = %5.2f%nMath.ceil   2.25 = %5.2f%nMath.ceil   2.50 = %5.2f%nMath.ceil   2.75 = %5.2f%n",
  Math.ceil(-2.25),Math.ceil(-2.50),Math.ceil(-2.75),Math.ceil(2.25),Math.ceil(2.50),Math.ceil(2.75));  
  System.out.printf("Math.floor -2.25 = %5.2f%nMath.floor -2.50 = %5.2f%nMath.floor -2.75 = %5.2f%nMath.floor  2.25 = %5.2f%nMath.floor  2.50 = %5.2f%nMath.floor  2.75 = %5.2f%n",
  Math.floor(-2.25),Math.floor(-2.50),Math.floor(-2.75),Math.floor(2.25),Math.floor(2.50),Math.floor(2.75));  
  System.out.printf("Math.rint  -2.25 = %5.2f%nMath.rint  -2.50 = %5.2f%nMath.rint  -2.75 = %5.2f%nMath.rint   2.25 = %5.2f%nMath.rint   2.50 = %5.2f%nMath.rint   2.75 = %5.2f%n",
  Math.rint(-2.25),Math.rint(-2.50),Math.rint(-2.75),Math.rint(2.25),Math.rint(2.50),Math.rint(2.75));  
  System.out.printf("Math.round -2.25 = %2d%nMath.round -2.50 = %2d%nMath.round -2.75 = %2d%nMath.round  2.25 = %2d%nMath.round  2.50 = %2d%nMath.round  2.75 = %2d%n",
  Math.round(-2.25),Math.round(-2.50),Math.round(-2.75),Math.round(2.25),Math.round(2.50),Math.round(2.75));  
  /*
  System.out.printf("Math.floorDiv -25/3 = %2d%nMath.floorDiv -25/2 = %2d%nMath.floorDiv -27/7 = %2d%nMath.floorDiv  25/3 = %2d%nMath.floorDiv  25/2 = %2d%nMath.floorDiv  27/7 = %2d%n",
  Math.floorDiv(-25,3),Math.floorDiv(-25,2),Math.floorDiv(-27,7),Math.floorDiv(25,3),Math.floorDiv(25,2),Math.floorDiv(27,7));  
  */     
  
 }
}