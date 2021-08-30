public class Distance {

    public static void main(String[] args) {
        System.out.println(distance(10, 2, 3, 15));
    }
    public static Double distance(int x1, int y1, int x2, int y2) {
        System.out.println((x2-x1)^2 + (y2-y1)^2);
        return Math.sqrt((x2-x1)^2 + (y2-y1)^2);
    }


}
