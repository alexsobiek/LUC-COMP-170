/*

	23.12 x 7/5/42
	15+14+13 x 2 x 5
	Define variables for each number
		First, second, third
		x, y, z….

 */

public class ThursdayLab {
    public static void main(String[] args) {
        handleFloats();
        log("");
        handleDoubles();
    }

    public static void handleDoubles() {
        log("Doubles:");
        //23.12 and 15.0 are doubles so it automatically uses the multiply() and add() methods for doubles
        log("23.12 x 7/5/42 = " + multiply( 23.12, divide(7.0, 5.0, 42.0)));
        log("15+14+13 x 2 x 5 = " + add(15.0, 14.0, multiply(13.0, 2.0, 5.0)));
    }

    public static void handleFloats() {

        log("Floats:");
        //cast 23.12 to float to be compatible with the multiply() method for floats
        log("23.12 x 7/5/42 = "+multiply((float) 23.12, divide( 7, 5, 42)));
        log("15+14+13 x 2 x 5 = " + add(15, 14, multiply(13, 2, 5)));
    }

    //Doubles
    private static double add(double ...input) {
        double output = 0;
        for(double num : input)
            output += num;
        return output;
    }
    private static double multiply(double ...input) {
        double output = 1;
        for(double num : input){
                output *= num;
        }
        return output;
    }
    private static double divide(double ...input) {
        double output = Math.pow(input[0], 2); //Square the first double so the first iteration has something to divide
        for(double num : input){
            output /= num;
        }
        return output;
    }

    //Floats
    private static float add(float ...input) {
        float output = 0;
        for(float num : input)
            output += num;
        return output;
    }
    private static float multiply(float ...input) {
        float output = 1;
        for(float num : input){
            output *= num;
        }
        return output;
    }
    private static float divide(float ...input) {
        float output = (float) Math.pow(input[0], 2); //Square the first float so the first iteration has something to divide
        for(float num : input){
            output /= num;
        }
        return output;
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}
