import java.util.Scanner;

public class KonversiWaktuScanner {
    public static Scanner input = new Scanner(System.in);
    public static int h, m, s, total;

    public static void scan () {
        System.out.print("Masukkan Jam : ");
        h = input.nextInt();
        System.out.print("Masukkan Menit : ");
        m = input.nextInt();
        System.out.print("Masukkan Detik : ");
        s = input.nextInt();

        pass();
    }

    public static void pass () {
        Jam baru = new Jam (h, m, s);
        System.out.print(baru.hh() + " Jam, " + baru.mm() + " Menit, " + baru.ss() + " Detik = ");
        total = ((baru.hh() * 3600) + baru.mm() * 60 + baru.ss());
        System.out.print(total + " Detik");
    }

    public static void main(String[] args) {
        scan();
    }
}
