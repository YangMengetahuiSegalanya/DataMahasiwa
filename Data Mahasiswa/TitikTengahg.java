//Titik Tengah dengan record & scanner
import java.util.Scanner;
public class TitikTengahg {
    public static Scanner input = new Scanner(System.in);
    public static float xs, xd, ys, yd, x3, y3;
    public static  Titik tengah;

    public static void hitung () {
        System.out.print("Masukkan x1 : ");
        xs = input.nextFloat();
        System.out.print("Masukkan x2 : ");
        xd = input.nextFloat();
        System.out.print("Masukkan y1 : ");
        ys = input.nextFloat();
        System.out.print("Masukkan y2 : ");
        yd = input.nextFloat();

    }

    public static void main(String[] args) {
        hitung();
        Titik tengah = new Titik(xs, xd, ys, yd);
        System.out.println("x1 = " + tengah.x1());
        System.out.println("x2 = " + tengah.x2());
        System.out.println("y1 = " + tengah.y1());
        System.out.println("y2 = " + tengah.y2());
        x3 = (tengah.x1() + tengah.x2())/2;
        y3 = (tengah.y1() + tengah.y2())/2;
        System.out.println("Titik tengah " + "(" + x3 + "," + y3 + ")");
    }
}
