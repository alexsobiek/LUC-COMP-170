public class FirstProgram {

    public static void main(String[] args) {
        log("Hello, world!");
        log("Hello, Alex!");
        log("Java is a fun language. Having multiple years of experience with other languages, beginning to learn Java last fall was fairly easy and everything was intuitive.");
        log("");
        log("Lets do some math:");
        log("The sum of 77 and 3 is " + add(77, 3));
        log("The product of 3 and 77 is " + multiply(3, 77));
        log("How about some decimals?");
        log("The sum of 77.3 and 3.77 is " + add(77.3, 3.77));
        log("The product of 3.77 and 77.3 is " + multiply(3.77, 77.3));
    }

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }
    public static Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public static Double add(Double a, Double b) {
        return a + b;
    }
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}
