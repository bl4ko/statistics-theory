import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Decrypt {
    public static void main(String[] args) {
        try {
            Scanner cypher = new Scanner(new File("cypher.txt"));
            HashMap<String, Integer> word2occurances = new HashMap<String, Integer>();
            while (cypher.hasNext()) {
                String beseda = cypher.next();
                int count = word2occurances.containsKey(beseda) ? word2occurances.get(beseda) : 0;
                word2occurances.put(beseda, count + 1);
            }
            System.out.println(Arrays.asList(word2occurances));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}