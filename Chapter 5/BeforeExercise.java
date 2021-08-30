public class BeforeExercise {
    public static void main(String[] args) {
        System.out.println(before(12, 1, 12, 4)); // true, same month, day 1 before day 2
        System.out.println(before(12, 8, 12, 4)); //false, same month but day 1 is after day 2
        System.out.println(before(1, 4, 12, 4)); // true, month1 comes before month2
    }

    public static Boolean before(int month1, int day1, int month2, int day2) {
        if (month1 == month2) return day1 < day2;
        else return month2 > month1;
    }

}
