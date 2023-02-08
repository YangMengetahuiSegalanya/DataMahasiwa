import java.util.Scanner;

public class ParkirMall {

    public static Scanner input = new Scanner(System.in);
    public static String question;
    public static int asli = 2000;
    public static int hargaMotor = 3000;
    public static int hargaMobil = 5000;
    public static int sanksi = 50000;

    public static void menu() {
        while (true) {
            System.out.println("==== SELAMAT DATANG DI PARKIRAN NERAKA DIMANA SEMUA DOSA BERADA ====");
            System.out.println("||| Kendaraan Yang Akan Masuk |||");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis kendaraan : ");

            int option = input.nextInt();

            switch (option) {
                case 1 -> motor();
                case 2 -> mobil();
                case 3 -> System.exit(0);
                default -> {
                    System.out.println("Jenis kendaraan yang input tidak valid, \n" +
                            "silahkan masukkan lagi");
                }
            }
        }
    }

    public static int waktu() {
        System.out.print("Durasi Parkir : ");
        int time = input.nextInt();
        System.out.println("Durasi parkir kendaraan adalah " + time + " jam");
        return time;
    }

    public  static void motor () {
        int durasi = waktu();
        if (durasi <= 2) {
            System.out.println("Biaya parkir = " + asli);
        }
        else if (durasi > 2 && durasi <= 24) {
            int bayar = (hargaMotor * (durasi - 2)) + asli;
            System.out.println("Biaya parkir = " + bayar );
        }
        else if (durasi > 24) {
            int day = (durasi / 24) * sanksi;
            int bayar = (hargaMotor * (durasi - 2)) + asli + day;
            System.out.println("Biaya parkir = " + bayar);
        }
        balik();
    }

    public  static void mobil () {
        int durasi = waktu();
        if (durasi <= 2) {
            System.out.println("Biaya parkir = " + asli);
        }
        else if (durasi > 2 && durasi <= 24) {
            int bayar = (hargaMobil * (durasi - 2)) + asli;
            System.out.println("Biaya parkir = " + bayar );
        }
        else if (durasi > 24) {
            int day = (durasi / 24) * sanksi;
            int bayar = (hargaMobil * (durasi - 2)) + asli + day;
            System.out.println("Biaya parkir = " + bayar);
        }
        balik();
    }

    public static void balik () {
        do {
            System.out.print("Apakah ada kendaraan yang akan keluar parkir? (y/t) : ");
            question = input.next();
            if (question.equalsIgnoreCase("y")) {
                menu();
            } else if (question.equalsIgnoreCase("t")) {
                System.out.println("Terimakasih sudah membayar :)");
                System.exit(0);
            } else {
                System.out.println("Input tidak dimengerti, silahkan ulangi.");
            }
        } while (!question.equalsIgnoreCase("y") && !question.equalsIgnoreCase("t"));
    }
    public static void main(String[] args) {
        menu();
    }
}
