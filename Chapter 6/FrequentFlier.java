import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FrequentFlier {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("frequentFlier.txt"));
        frequentFlier(input);
    }

    public static void frequentFlier(Scanner input) {

        String type = "CLASS";
        int total = 0;
        String lastClass = null;

        while (input.hasNext()) {
            String next = input.next();
            if (type.equals("CLASS")) {
                lastClass = next.toLowerCase();
                type = "MILES";
            } else if (type.equals("MILES")) {
                int miles = Integer.parseInt(next);
                switch(lastClass) {
                    case "firstclass":
                        total += 2*miles;
                        break;
                    case "coach":
                        total += miles;
                        break;
                }
                type = "CLASS";
            }
        }
        System.out.println("Total Frequent-Flier Miles: " + total);
    }
}
