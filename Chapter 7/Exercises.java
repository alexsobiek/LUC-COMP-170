import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        e7();
    }

    public static void e1() {
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
        }
        System.out.println(Arrays.toString(list));
    }

    public static void e7() {
        int[] a1 = {2, 4};
        mystery(a1);
        System.out.println(Arrays.toString(a1));
        int[] a2 = {1, 3, 6};
        mystery(a2);
        System.out.println(Arrays.toString(a2));
        int[] a3 = {7, 2, 8, 4};
        mystery(a3);
        System.out.println(Arrays.toString(a3));
        int[] a4 = {5, 2, 7, 2, 4};
        mystery(a4);
        System.out.println(Arrays.toString(a4));
        int[] a5 = {2, 4, 6, 3, 7, 9};
        mystery(a5);
        System.out.println(Arrays.toString(a5));
    }

    public static void mystery(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                a[i] = a[i + 1];
            }
        }
    }

}
