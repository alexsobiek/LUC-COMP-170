public class Equation {
    public static void main(String[] args) {
        System.out.println("Calculating y if x = 1");
        System.out.println("= " + calculate(1.0));
    }
    private static double calculate(double x) {
        return pow(12.3, x, 4) - pow(9.1, x, 3) + pow(19.3, x, 2) - (4.6 * x) + 34.2;
    }
    private static double pow(double a, double b, double pow) {
        return Math.pow((a * b), pow);
    }
}
