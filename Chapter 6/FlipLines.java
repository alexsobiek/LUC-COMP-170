import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

/*

Twas brillig and the slithy toves
did gyre and gimble in the wabe.
All mimsey were the borogroves,
and the mome raths outgrabe.

The End

----

did gyre and gimble in the wabe.
Twas brillig and the slithy toves
and the mome raths outgrabe.
All mimsey were the borogroves,
The End

*/


public class FlipLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner stdin = new Scanner(new File("flipLines.txt"));
        flipLines(stdin);
    }

    public static void flipLines(Scanner stdin) {
        while (stdin.hasNext()) {
            String line1 = stdin.nextLine();
            String line2 = stdin.nextLine();
            System.out.println(line2);
            System.out.println(line1);
        }
    }

}
