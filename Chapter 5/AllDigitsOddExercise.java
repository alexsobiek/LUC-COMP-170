public class AllDigitsOddExercise {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(135319));
        System.out.println(allDigitsOdd(9145293));
    }

    public static Boolean allDigitsOdd(int num) {
        boolean result = true;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                result = false;
                break;
            }
            num = num / 10;
        }
        return result;
    }

}
