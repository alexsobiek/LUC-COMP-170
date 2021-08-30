public class digitSumExercise {
    public static void main(String[] args) {
        System.out.println(digitSum(29107));
        System.out.println(digitSum(-456));
        System.out.println(digitSum(0));
    }

    public static int digitSum(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
