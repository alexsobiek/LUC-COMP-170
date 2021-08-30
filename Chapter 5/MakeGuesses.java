import java.util.Scanner;

public class MakeGuesses {
    public static void main(String[] args) {




        Scanner stdin = new Scanner(System.in);

        String response;

        do {
            response = stdin.next();
        } while (!(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n")));

        int guess = userInput(stdin);
        int tries = 1;
        while (guess <= 48) {
            guess = userInput(stdin);
            tries++;
        }
        System.out.println("total guesses = " + tries);

    }

    private static int userInput(Scanner stdin) {
        System.out.print("guess = ");
        return stdin.nextInt();
    }



}
