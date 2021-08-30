public class Top {
    public static void main(String[] args) {
        drawVerticalBars(5);
        drawDome(3, false);
        drawHorizontalBars(1);
        drawDome(3, true);
        drawVerticalBars(9);
        drawHorizontalBars(4);
    }

    public static int getWidth() {
        return 8;
    }

    public static void drawVerticalBars(int n) {
        for (int i = 0; i < n; i++) {
            log(center("||"));
        }
    }
    public static void drawHorizontalBars(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder output = new StringBuilder();
            for (int w = 0; w < getWidth(); w++) {
                output.append("=");
            }
            log(output.toString());
        }

    }
    public static void drawStars(int n) {
        StringBuilder output = new StringBuilder("||");
        for (int i = 0; i < n; i++) {
            output.insert(0, "*");
            output.append("*");
        }
        log(center(output.toString()));
    }
    public static void drawDome(int n, Boolean inverse) {
        if (inverse) { //draw the dome upside down
            for (int i = n; i >= 0; i--) {
                drawStars(i);
            }
        } else {
            for (int i = 0; i <= n; i++) {
                drawStars(i);
            }
        }
    }
    public static String center(String input) {
        StringBuilder output = new StringBuilder(input);
        int length = input.length();
        int difference = getWidth() - length;
        for (int i = 0; i < difference / 2; i++) {
            output.insert(0, " ");
            output.append(" ");
        }
        return output.toString();
    }

    public static void log(String msg) {
        System.out.println(msg);
    }
}
