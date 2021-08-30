public class TAPay {
    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }
    public static double pay(double wage, int hours) {
        if (hours > 8) {
            int overtime = hours - 8;
            double normalPay = wage * 8;
            wage = wage * 1.5;
            double overtimePay = wage * overtime;
            return normalPay + overtimePay;
        } else {
            return wage * hours;
        }

    }
}
