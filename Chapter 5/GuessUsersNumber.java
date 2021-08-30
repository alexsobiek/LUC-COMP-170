import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GuessUsersNumber {

    public static final List<Integer> random = new ArrayList<>();

    public static void main(String[] args) {
        populateArray();
        Scanner stdin = new Scanner(System.in);
        System.out.println("This program has you, the user, choose a number between 1 and 10. Then I, the computer, will try my best to guess it.");
        int guesses = 1;
        for (int num : random) {
            System.out.print("Is it " + num + "? (y/n) ");
            String answer = stdin.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("I got your number of " + num + " correct in " + guesses +" guesses.");
                break;
            } else {
                guesses++;
                if (guesses > 10) System.out.println("I couldn't guess your number :(");
            }
        }
    }

    public static void populateArray() {
        for (int i = 1; i <= 10; i++) random.add(i);
        Collections.shuffle(random);
    }

}
