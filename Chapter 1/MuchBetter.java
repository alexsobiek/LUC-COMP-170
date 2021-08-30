public class MuchBetter {
    public static void main(String[] args) {
        log("A \"quoted\" String is");
        log("'much' better if you learn");
        log("the rules of \"escape sequences.\"");
        log("");
        log("Also, \"\" represents an empty String.");
        log("Don't forget: use \\\" instead of \" !");
        log("'' is not the same as \"");
    }

    //I'm used to implementing a logger in my applications. If this is an issue, I can switch to just using System.out.println();
    private static void log(String msg) {
        System.out.println(msg);
    }
}
