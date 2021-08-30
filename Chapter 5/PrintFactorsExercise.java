import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PrintFactorsExercise {
    public static void main(String[] args) {
        printFactors(24);
    }

    public static void printFactors(int num) {
        StringBuilder output = new StringBuilder();
        Object[] factors = calcFactors(num);
        int i = 1;
        for (Object factor : factors) {
            output.append(factor);
            if (i != factors.length) {
                output.append(" and ");
            }
            i++;
        }
        System.out.println(output.toString());
    }

    private static Object[] calcFactors(int num) {
        HashSet<Integer> factors = new HashSet<>();
        int i = 1;
        while(i <= num) {
            factors.add(num / i);
            i++;
        }
        ArrayList<Integer> output = new ArrayList<Integer>(factors);
        Collections.sort(output);
        return output.toArray();
    }

}
