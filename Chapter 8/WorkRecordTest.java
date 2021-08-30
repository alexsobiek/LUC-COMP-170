public class WorkRecordTest {
    public static void main(String[] args) {
        WorkRecord wA = new WorkRecord("Andy");   // hours == 0
        WorkRecord wG = new WorkRecord("George"); // hours == 0
        wG.addHours(3); // update hours: 0+3=3
        System.out.println(wG.getHours());      // prints   3
        wG.addHours(2); // update hours: 3+2=5
        System.out.println(wG);                 // prints   George: 5 hours
        System.out.println(wA);                 // prints   Andy: 0 hours
    }
}
