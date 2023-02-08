public class MenghitungBanyakProdukUnik {
    public static void main(String[] args) {
        final Reader in = new Reader();

        final int min = in.nextInt(), max = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        in.close();

        int ca = 0, cb = 0, cc = 0;

        for (int i = min; i <= max; i++) {
            if (i % a == 0 && i % b != && i % C != 0) ca++;
            else if (i % a != 0 && i % b == 0 && i % c != 0) cb++;
            else if (i % a != 0 && i % b != 0 && i % c == 0) cc++;
        }
        
        Sytstem.out.println(ca + cb + cc);
    }
}