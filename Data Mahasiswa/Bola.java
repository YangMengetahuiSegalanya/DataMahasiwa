/*n merah ambil x
m putih ambil y
nomor seri beda*/

//banyak cara pengambilan bola

import java.util.Scanner;

public class Bola {
	public static int kombinasi(int n, int x) {
		//int NM = N + M;
		int nfaktorial = 1;
		for(int i = n; i > 0; i--){
			nfaktorial *= i;
		}
		
		int xfaktorial = 1;
		for(int i = x; i > 0; i--){
			xfaktorial *= i;
		}
		
		int nminx = n - x;
		int nminxfaktorial = 1;
		for(int i = nminx; i > 0; i--){
			nminxfaktorial *= i;
		}
		
		int cara = nfaktorial / (xfaktorial * nminxfaktorial);
		return cara;
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jumlah bola merah: ");
		int N = input.nextInt();
		System.out.print("Masukkan jumlah bola putih: ");
		int M = input.nextInt();
		int total = N + M;
		System.out.print("Jumlah bola yang diambil: ");
		int ambil = input.nextInt();
		System.out.print("Bola merah yang diambil: ");
		int X = input.nextInt();
		System.out.print("Bola putih yang diambil: ");
		int Y = input.nextInt();
		
		
		//kombinasi = total! dibagi x!(n-x)!
		int totalCara = kombinasi(N, X) * kombinasi(M, Y);
		
		System.out.println("Kombinasi diambilnya " + X + " bola merah dan " + Y + " bola putih adalah: " + totalCara);
		
		
	}
}