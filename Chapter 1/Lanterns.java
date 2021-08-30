public class Lanterns {
    public static void main(String[] args) {
        sectionA();
        sectionB();
        sectionC();
    }

    //Sections
    public static void sectionA() {
        top();
        log("");
    }
    public static void sectionB() {
        top();
        mid();
        top();
        log("");
    }
    public static void sectionC() {
        top();
        bottom();
        log("* | | | | | *");
        log("* | | | | | *");
        bottom();
        bottom();
    }

    //Partials
    public static void fullLine() {
        log("*************");
    }
    public static void top() {
        log("    *****");
        log("  *********");
        fullLine();
    }
    public static void mid() {
        log("* | | | | | *");
    }
    public static void bottom() {
        log("    *****");
    }

    //Logging
    public static void log(String msg) {
        System.out.println(msg);
    }
}
