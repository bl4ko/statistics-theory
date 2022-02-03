import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

public class Checker {
    
    public static void main(String[] args) {
        int[] piva = new int[12];
        // 0=Porter, 1=Indian Pale Ale
        for (int i = 0; i < 12; i++) {
            if (i < 6) {
                piva[i] = 0;
            }
            else {
                piva [i] = 1;
            }
        }
        int st_uspesnih = 0;
        for (int i = 0; i < 1000000; i++) {
            if (verjetnost(piva) == 2) {
               st_uspesnih++; 
            }
        }
        System.out.println((float) st_uspesnih / (float) 1000000);
    }

    private static int verjetnost(int[] arr) {
        int vsota = 0;
        HashSet<Integer> izbrani = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int int_random = rand.nextInt(12);
            while (izbrani.contains(int_random)) {
                int_random = rand.nextInt(12);
            }
            izbrani.add(int_random);
            vsota += arr[int_random];
        }
        return vsota;
    }
}