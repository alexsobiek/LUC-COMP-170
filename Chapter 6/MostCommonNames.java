import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MostCommonNames {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("mostCommonNames.txt"));
        mostCommonNames(input);
    }

    public static void mostCommonNames(Scanner input) {
        while (input.hasNextLine()) {

            String[] names = input.nextLine().trim().split("\\s+");
            LinkedHashMap<String, Integer> occurrences = new LinkedHashMap<>();

            for (String name : names) {
                if (!(occurrences.containsKey(name))) {
                    occurrences.put(name, 1);
                } else {
                    occurrences.replace(name, occurrences.get(name) + 1);
                }
            }


            String mostOccurred = null;
            int mostOccurredCount = 0;

            for (Map.Entry<String, Integer> e : occurrences.entrySet()) {
                if (e.getValue() > mostOccurredCount) {
                    mostOccurred = e.getKey();
                    mostOccurredCount = e.getValue();
                }
            }

            System.out.println("Most common: " + mostOccurred);
        }
    }
}
