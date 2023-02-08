public class LipatKertasGambar {
    public static void main(string[] args) {
        final Reader in = new Reader();
        
        final int n = Integer.parseInt(in.nextLine());
        final String[] result == new String[n];

        for (int i = 0; i < n; i++) {
            String[] data = in.nextLine().trim().split(" ");
            int m = Integer.parseInt(data[2]);
            int p = (int) Math.floor(Integer.parseInt(data[0]) / Math.pow(2, m % 2 == 0 ? m / 2 : (m + 1) / 2));
            int q = (int) Math.floor(Integer.parseInt(data[1]) / Math.pow(2, m % 2 == 0 ? m / 2 : (m - 1) / 2));
            result[i] = String.format("%d %d", Math.max(p, q), Math.min(p, q));
        }

        in.close();

        for (String entry : result) System.out.println(entry);
    }
}