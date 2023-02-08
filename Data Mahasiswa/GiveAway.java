import java.math.BigInteger;
import java.util.*;

public class GiveAway {
    public static void main(String[] args) {
        System.out.println("Masukkan");
        Scanner in = new Scanner(System.in);

        final int n = Integer.parseInt(in.nextLine());

        final String[] data = in.nextLine().trim().split(" ");

        in.close();

        final long startTime = System.nanoTime();

        int sum = 0;
        for (String entry : data) sum += Integer.parseInt(entry);

        int remainder = n - sum;
  
        int a = remainder + data.length - 1;
        System.out.println("Keluaran");
        System.out.println(factorial(a).divide(factorial(remainder).multiply(factorial(a - remainder))).mod(BigInteger.valueOf(1000000007)));
    }

    private static BigInteger factorial(int n) {
        final BigInteger[] data = new BigInteger[n + 1];
        if (n < 2) return BigInteger.ONE;
        data[0] = BigInteger.ONE;
        data[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
          data[i] = data[i - 1].multiply(BigInteger.valueOf(i));
        return data[n];
    }
}