import java.util.Scanner;

public class CollegeAdmit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your GPA? ");
        Double GPA = console.nextDouble();
        System.out.print("What is your SAT score? ");
        int SAT = console.nextInt();

        checkStats(GPA, SAT);

    }

    private static void checkStats(Double GPA, int SAT) {
        if (GPA > 1.8 && SAT > 900) {
            System.out.println("You were accepted!");
        } else {
            System.out.println("You were not accepted.");
        }
    }
}
