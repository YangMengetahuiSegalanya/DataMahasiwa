import java.util.*;
public class ProgramParkir {

    public static Scanner scan = new Scanner(System.in);
    public static char yn;
    public static int mobilp;
    public static int motorp;
    public static int hpertama = 3000;
    public static int biaya;
    public static int biaya2;
    public static int biaya3;
    public static int pilihan;

    public static void pilihanMenu() {
        System.out.println("### Program Parkir ###");
        System.out.println("1. Mobil");
		System.out.println("2. Motor");
		System.out.println("Pilih Jenis Kendaraan");
        pilihan = scan.nextInt();
		scan.nextLine();
    }
    public static void inputMobil(){

    while(true) {

    System.out.println("Durasi Parkir : ");
    mobilp = scan.nextInt();
    scan.nextLine();

    if (mobilp >= 2){
    biaya = mobilp / 2 * hpertama;
    System.out.println("Biaya Parkir : " + biaya );
    }
         else if (mobilp > 2){
            biaya2 = (mobilp - 2) * 2000 + 3000;
             System.out.println("Biaya Parkir : " + biaya2 );
         }
         else if (mobilp > 24){
             biaya3 = mobilp * 100000 + biaya + biaya2;
             System.out.println("Biaya Parkir : " + biaya3 );

             System.out.print("\nLanjutkan cari nilai terendah (y/n)?");
             yn = scan.next();
			
             if(yn == 'y') {
                 break;
             }
                 else{
                     System.exit(0);
                     break;
                 }

         }
         System.out.println("");
    }
}

    public static void inputMotor(){

        while(true) {

            System.out.println("Durasi Parkir : ");
    motorp = scan.nextInt();
    scan.nextLine();
         
    if (motorp >= 2){
        biaya = motorp / 2 * hpertama;
        System.out.println("Biaya Parkir : " + biaya );
        }
        else if (motorp > 2){
            biaya2 = (motorp - 2) * 2000 + 3000;
            System.out.println("Biaya Parkir : " + biaya2 );
        }
        else if (motorp > 24){
            biaya3 = motorp * 100000 + biaya + biaya2;
            System.out.println("Biaya Parkir : " + biaya3 );

            System.out.print("\nLanjutkan Cari Biaya? (y/n)?");
			yn = scan.next();
			
			if(yn == 'y') {
				break;
            }
                else{
                    System.exit(0);
					break;
                }

        }
        System.out.println("");
}
        }
    public static void main(String[] args) {
        while(true) {
			pilihanMenu();
            switch(pilihan) {
				case 1:
                inputMobil();
					break;
				case 2:
                inputMotor();
					break;
            }
          }
       }
    }