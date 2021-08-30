import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {

    }

    // Counts the total lines and words in the given input scanner.
    public static void countWords(Scanner input) throws FileNotFoundException { // Count Words must throw a FileNotFound Exception or include a Try/Catch
        // Scanner input = new Scanner(new File("example.txt")); <-- Scanner is a a parameter of the method, no need to declare it again
        int lineCount = 0;
        int wordCount = 0;

        while (input.hasNextLine()) { // should be input.hasNextLine()
            String line = input.nextLine();       // read one line   // should be input.nextLine()
            lineCount++;

            // Call a new instance of StringTokenizer
            StringTokenizer stringTokenizer = new StringTokenizer(line);

            while (stringTokenizer.hasMoreTokens()) {             // count tokens in line   // Use .hasMoreTokens()
                String word = stringTokenizer.nextToken(); // Use .nextToken()
                wordCount++;
            }
        }
    }
}
