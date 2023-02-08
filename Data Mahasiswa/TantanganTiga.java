public class TantanganTiga {
	
	public static Scanner scan = new Scanner(System.in);
	public static int pilihan = 0;
	public static float nilai;
        public static String nim;
        public static String nama;
        public static ArrayList<String> arrListNim = new ArrayList<String>();
        public static ArrayList<String> arrListNama = new ArrayList<String>();
	public static ArrayList<Float> arrListNilai = new ArrayList<Float>();
	public static char yn;
	
        public static ArrayList<Float> arrListNilai = new ArrayList<Float>();
	public static char yn;
	
	public static final String format = "###.##";
	public static final DecimalFormat df = new DecimalFormat(format);
	
	public static int peringkat;
	
	public static void pilihMenu()  {
		System.out.println("### Program NilaiMaksMin ###");
		System.out.println("1. Input Nilai");
		System.out.println("2. Lihat Nilai");
		System.out.println("3. Cari Nilai Tertinggi");
		System.out.println("4. Cari Nilai Terendah");
		System.out.println("5. Keluar");
		
		System.out.print("Silahkan pilih menu: ");
		pilihan = scan.nextInt();
		scan.nextLine();
	}
	
	public static void inputNilai() {
		System.out.println("\n1. Input Nilai, Nama, NIM :");
		
		while(true) {
			System.out.print("Masukkan nilai: ");
			nilai = scan.nextFloat();
			scan.nextLine();
                        arrListNilai.add(nilai);
			
                        System.out.print("Masukkan Nama: ");
                        nama = scan.nextFloat();
			scan.nextLine();
                        arrListNilai.add(nama);
                        
                        System.out.print("Masukkan NIM: ");
                        nim = scan.nextFloat();
			scan.nextLine();
                        arrListNilai.add(nilai);
                  
			System.out.print("\nLanjutkan input nilai (y/n)?");
			yn = scan.next().charAt(0);
			
			if(yn != 'y') {
				break;
			}
			System.out.println("");
		}		
	}
	
	public static void lihatNilai() {
		System.out.println("\n2. Lihat Nilai");
		for(Float nilai : arrListNilai) {
			System.out.println("Nilai : " + df.format(nilai));
                for(String Nama : arrListNama) {
                        system.out.println("Nama : " + df.format(nama));
                for(String NIM : arrListNim) {
                        system.out.println("NIM : " + df.format(nim));  
		}
		System.out.println("");
                 
	}
	
	public static void cariNilaiTertinggi() {
		System.out.println("\n3. Cari Nilai Tertinggi");
		while(true) {
			System.out.print("Masukkan peringkat: ");
			peringkat = scan.nextInt();
			scan.nextLine();
                        System.ou.print("");

			Collections.sort(arrListNilai);
			System.out.println(df.format(arrListNilai.get(arrListNilai.size() - peringkat)));

			System.out.print("\nLanjutkan cari nilai tertinggi (y/n)?");
			yn = scan.next().charAt(0);
			
			if(yn != 'y') {
				break;
			}
			System.out.println("");
		}
	}
	
	public static void cariNilaiTerendah() {
		System.out.println("\n3. Cari Nilai Terendah");
		while(true) {
			System.out.print("Masukkan peringkat: ");
			peringkat = scan.nextInt();
			scan.nextLine();
			
			Collections.sort(arrListNilai);
			System.out.println(df.format(arrListNilai.get(peringkat - 1)));
		
			System.out.print("\nLanjutkan cari nilai terendah (y/n)?");
			yn = scan.next().charAt(0);
			
			if(yn != 'y') {
				break;
			}
			System.out.println("");
		}
       }

	public static void main(String[] args) {
		while(true) {
			pilihMenu();
			
			switch(pilihan) {
				case 1:
					inputNilai();
					break;
				case 2:
					lihatNilai();
					break;
				case 3:
					cariNilaiTertinggi();
					break;
				case 4:
					cariNilaiTerendah();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Maaf, pilihan tidak valid!."+ "\nSilahkan ulangi masukkan pilihan!");
					break;
			}
		}
		
	}
}