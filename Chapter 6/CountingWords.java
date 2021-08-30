import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("hamlet.txt"));

        int linesWithWhitespace = 0; // = 5302
        int linesNoWhitespace = 0; // = 4267
        int words = 0; // = 32230
        int charsWithWhitespace = 0; // = 173541
        int charsNoWhitespace = 0; // = 142368

        while (input.hasNextLine()) {
            String next = input.nextLine();
            linesWithWhitespace++;
            charsWithWhitespace += next.toCharArray().length;
            if (next.length() > 0) {
                linesNoWhitespace++;
                words += split(next).length;
                charsNoWhitespace += String.join("", split(next)).toCharArray().length;
            }
        }

        System.out.println("Lines (With Whitespace): " + linesWithWhitespace);
        System.out.println("Lines (No Whitespace): " + linesNoWhitespace);
        System.out.println("Words: " + words);
        System.out.println("Characters (With Whitespace):" + charsWithWhitespace);
        System.out.println("Characters (No Whitespace): " + charsNoWhitespace);

    }

    private static String[] split(String input) {
        return input.trim().split("\\s+"); // Removes unnecessary whitespace
    }
}
