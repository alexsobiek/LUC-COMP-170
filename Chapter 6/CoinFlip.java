import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("coinFlips.txt"));
        coinFlip(input);
    }

    public static void coinFlip(Scanner input) {
        List<Result> results = new ArrayList<>();

        while (input.hasNextLine()) {

            int hCount = 0;
            int tCount = 0;

            char[] round = input.nextLine().toLowerCase().toCharArray();

            for (char r : round) {
                if (r == 't') tCount++;
                else if (r == 'h') hCount++;
            }

            Result res = new Result(hCount, tCount);
            results.add(res);

        }

        for (Result res : results) {
            System.out.println(res.getHCount() + " heads (" + Math.round((res.getHPercentage() * 100) * 10) / 10.0 + "%)");
            if (res.getHPercentage() > 0.5) System.out.println("You win!");
            System.out.println();
        }
    }
}


class Result {
    private final int hCount;
    private final double hPercentage;

    public Result(int hCount, int tCount) {
        this.hCount = hCount;
        this.hPercentage = (double) hCount / (hCount + tCount);
    }

    public int getHCount() {
        return hCount;
    }

    public double getHPercentage() {
        return hPercentage;
    }
}