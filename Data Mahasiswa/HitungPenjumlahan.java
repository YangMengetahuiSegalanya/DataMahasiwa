import java.util.*;

public class HitungPenjumlahan {
    public static void main(String[] args) {
        System.out.println("Masukkan");
        Scanner in = new Scanner(System.in);
        final int n = Math.min(in.nextInt(), 10000);
        final int m = Math.min(in.nextInt(), 10000);
        final int q = Math.min(in.nextInt(), 100000);
        final int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 a[i][j] = Math.min(in.nextInt(), 10000);
        }
    }

        for (int i = 0; i < q; i++) {
            final int x1 = in.nextInt() - 1, y1 = in.nextInt() - 1, x2 = in.nextInt() - 1, y2 = in.nextInt() -1;
            int sum = 0;
            for (int j = x1; j <= x2; j++) {
                 for (int k = y1; k <= y2; k++) {
                      sum += a[j][k];
            }
        }
            System.out.println("Keluaran");
        }
            in.close();
     }
}