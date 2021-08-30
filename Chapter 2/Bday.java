public class Bday {
    public static void main(String[] args) {
        System.out.println("My birthday is " + myBirthday() + ", and Suzy's is " + suzysBirthday());
    }
    public static String myBirthday() {
        int month = 12;
        int day = 1;
        return month + "/" + day;
    }
    public static String suzysBirthday() {
        int month = 6;
        int day = 14;
        return month + "/" + day;
    }
}
