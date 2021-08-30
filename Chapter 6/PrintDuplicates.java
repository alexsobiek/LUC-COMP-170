import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("duplicates.txt"));
        printDuplicates(input);
    }

    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            String[] words = input.nextLine().trim().split("\\s+"); // Array of words on each line

            int i = 1;
            int count = 1;

            while ((i-1) > -1 && i < words.length) {
                if (words[i-1].equals(words[i])) { // Consecutive Match
                    count++;
                    if (i == (words.length - 1)) {
                        System.out.print(words[i - 1] + "*" + count + " ");
                        count = 1;
                    }
                } else {
                    if (count > 1) {
                        System.out.print(words[i - 1] + "*" + count + " ");
                        count = 1;
                    }
                }
                i++;
            }
            System.out.println();
        }
    }
}