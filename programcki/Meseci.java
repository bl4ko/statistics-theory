import java.util.Random;

public class Meseci {

    private static int ST_POSKUSOV = 100000000;
    public static void main(String[] args) {
        Random rand = new Random();
        int uspesni = 0;

        for (int poskus =0; poskus < ST_POSKUSOV; poskus++) {
            int prvi_poskus = rand.nextInt(12);
            for (int i = 0; i < 3; i++) {
                int ostali_poskus = rand.nextInt(12);
                if (ostali_poskus != prvi_poskus) {
                    break;
                }
                if (i == 2) {
                    uspesni++;
                }
            }
        }
        System.out.println(uspesni);
        System.out.println((float) uspesni / (float) ST_POSKUSOV);
    }
}