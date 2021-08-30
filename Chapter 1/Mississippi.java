public class Mississippi {
    public static void main(String[] args) {
        printM();
        printISS();
        printISS();
        printI();
        printP();
        printP();
        printI();
    }


    //Partial Methods
    public static void printISS() {
        printI();
        printS();
        printS();
    }

    //Letter Methods
    public static void printM() {
        log("M     M");
        log("MM   MM");
        log("M M M M");
        log("M  M  M");
        log("M     M");
        log("M     M");
        log("M     M");
        log("");
    }
    public static void printI() {
        log("IIIIIII");
        log("   I");
        log("   I");
        log("   I");
        log("   I");
        log("   I");
        log("IIIIIII");
        log("");
    }
    public static void printS() {
        log("SSSSSSS");
        log("S");
        log("S");
        log("SSSSSSS");
        log("      S");
        log("      S");
        log("SSSSSSS");
        log("");
    }
    public static void printP() {
        log("PPPPPPP");
        log("P     P");
        log("P     P");
        log("PPPPPPP");
        log("P");
        log("P");
        log("P");
        log("");
    }

    public static void log(String msg)  {
        System.out.println(msg);
    }

}
