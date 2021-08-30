public class FightSong {
    public static void main(String[] args) {
        chorus();
        log("");
        verse();
        verse();
        chorus();
    }

    public static void chorus() {
        log("Go, team, go!");
        log("You can do it.");
    }
    public static void verse() {
        chorus();
        log("You're the best,");
        log("in the West.");
        chorus();
        log("");
    }

    //Logging
    public static void log(String msg) {
        System.out.println(msg);
    }
}
