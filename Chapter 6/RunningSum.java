import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class RunningSum {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        Scanner stdin = new Scanner(input);
        runningSum(stdin);
    }

    public static void runningSum(Scanner stdin) {
        DoubleStream.Builder builder = DoubleStream.builder();

        double rs = 0.0;

        while (stdin.hasNextDouble()) {
            double sum = stdin.nextDouble() + rs;
            builder.add(sum);
            rs = sum;
        }

        StringBuilder runSumOuput = new StringBuilder("running sum = ");
        double[] numbers = builder.build().toArray();
        for (double n : numbers) runSumOuput.append(n).append(" ");

        System.out.println(runSumOuput.toString());

        Arrays.sort(numbers);
        System.out.println("max sum = " + numbers[numbers.length - 1]);
    }
}
