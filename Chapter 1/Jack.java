public class Jack {

    public static void main(String[] args) {
        log("This is the house that Jack built.\n"); //1

        log("This is the malt"); //2
        firstEnding();

        log("This is the rat,"); //3
        secondEnding();

        log("This is the cat,"); //4
        log("That killed the rat,");
        secondEnding();

        log("This is the dog,"); //5
        thirdEnding();

        log("This is the cow with the crumpled horn,");
        fourthEnding();

        log("This is the maiden all forlorn"); //7
        finalEnding();
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public static void firstEnding() {
         log("That lay in the house that Jack built.\n");
    }

    public static void secondEnding() {
        log("That ate the malt");
        firstEnding();
    }

    public static void thirdEnding() {
        log("That worried the cat,");
        log("That killed the rat,");
        secondEnding();
    }

    public static void fourthEnding() {
        log("That tossed the dog,");
        thirdEnding();
    }

    public static void finalEnding() {
        log("That milked the cow with the crumpled horn,");
        fourthEnding();
    }

}
