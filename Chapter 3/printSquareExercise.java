public class printSquareExercise {

    public static void main(String[] args) {
        printSquare(3, 7);
    }

    private static void printSquare(int a, int b) {
        if (b > a) { //make sure that we are able to count up
            StringBuilder output = new StringBuilder();
            int leading = a;
            int nextNum = a;
            int iterations = b - a;
            for(int i = 0; i <= iterations; i++) {
                for (int n = 0; n <= iterations; n++) {
                    if (nextNum > b) {
                        //start sequence over
                        nextNum = a;
                    }
                    output.append(nextNum);
                    nextNum++;
                }
                leading++;
                nextNum = leading;
                output.append("\n");
            }
            System.out.println(output);
        }
    }

}
