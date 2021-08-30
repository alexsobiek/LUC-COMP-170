import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "duplicates.txt";
        Scanner input = new Scanner(new File(file));
        PrintWriter printer = new PrintWriter(file + ".cpy");

        while (input.hasNextLine()) {
            printer.write(input.nextLine() + "\n");
        }
        printer.close();
    }
}
