import java.util.Random;

public class Coin {

    private static int ST_POSKUSOV = 100000000;

    public static void main(String[] args) {
        // cifra=0, glava=1
        int[] verjetnosti = {0, 0, 0, 1, 1};
        Random rand = new Random();
        int st_uspesnih = 0;

        for (int i = 0; i < ST_POSKUSOV; i++) {
            int verjetnost = 0;
            for (int j = 0; j < 2; j++) {
                int poskus = rand.nextInt(5);
                verjetnost += verjetnosti[poskus];
            }
            if (verjetnost % 2 == 0) {
                st_uspesnih += 1;
            }
        }
        System.out.println((float) st_uspesnih / (float) ST_POSKUSOV);
    }
}
