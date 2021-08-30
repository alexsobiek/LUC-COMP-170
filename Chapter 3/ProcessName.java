import java.util.*;  // for Scanner

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.next();

        name = processName(name);

        System.out.println("Your name is: " + name);
    }

    private static String processName(String name) {
        String[] parts = name.split(" ");
        return parts[1] + ", " + parts[0].charAt(0) + ".";
    }
}