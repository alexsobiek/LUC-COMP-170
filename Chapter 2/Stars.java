public class Stars {
    public static void main(String[] args) {

        int shift = 9;
        int multiplier = -2;
        int line = 4;

        for (int stars = 1; stars <= multiplier * line + shift; stars++) {

            line--;
        }
    }
}
