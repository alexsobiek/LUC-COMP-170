public class Expressions {
    public static void main(String[] args) {
        String str1 = "Frodo Baggins";
        String str2 = "Gandalf the GRAY";

        log(""+str1.charAt(7));
        log(""+str2.charAt(0));

    }

    public static void log(String msg) {
        System.out.println(msg);
    }
}
