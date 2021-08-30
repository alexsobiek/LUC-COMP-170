public class WhileLoopMystery {
    public static void main(String[] args) {
        mystery4(2);
        mystery4(5);
        mystery4(24);
        mystery4(28);
    }

    public static void mystery(int x) {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    public static void mystery2(int x, int y) {
        int z = 0;
        while (x % y != 0) {
            x = x / y;
            z++;
            System.out.print(x + ", ");
        }

        System.out.println(z);
    }

    public static void mystery4(int n) {
        int x = 1;
        int y = 2;
        while (y < n) {
            if (n % y == 0) {
                n = n / y;
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x + " " + n);
    }

}
