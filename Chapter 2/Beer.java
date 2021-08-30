public class Beer {
    public static void main(String[] args) {
        for (int count = 10; count > 0; count--) {
            System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer");
            System.out.println("Take one down, pass it around, " + (count - 1) + " bottles of beer on the wall\n");
        }
    }
}
