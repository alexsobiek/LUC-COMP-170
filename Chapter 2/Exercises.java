public class Exercises {
    public static void main(String[] args) {
        E();
    }
    public static void A() {
        System.out.println(12 / 5 + 8 / 4);
        System.out.println(3 * 4 + 15 / 2);
        System.out.println(-(1 + 2 * 3 + (1 + 2) * 3));
        System.out.println(42 % 5 + 16 % 3);
        System.out.println(2.5 * 2 + 17 / 4);
        System.out.println(4.5 / 3 / 2 + 1);
    }
    public static void B() {
        System.out.println(2 + 6 + "cs");
        System.out.println("cs 123" + 2 + 6);
        System.out.println(1 + 9 / 2 * 2.0);
        System.out.println(46 / 3 / 2.0 / 3 * 4/5);
        System.out.println(50 / 9 / 2.0 + 200 / 10 / (5.0 / 2));
    }
    public static void C() {
        System.out.println(123 * 456 - 789);
        System.out.println(3.14 + 1.59 * 2.65);
        System.out.println(2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2);
        System.out.println(2 + 2 + "xyz" + 3 + 3);
    }
    public static void D() {
        int a = 5;
        int b = 10;
        int c = b;
        System.out.println(c+a);
    }
    public static void E() {
        int i = 2;
        int j = 3;
        int k = 4;
        int x = i + j + k;
        i = x - i - j;
        System.out.println(i);
        j = x - j - k;
        System.out.println(j);
        k = x - i - k;
        System.out.println(k);
    }
}


