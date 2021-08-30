import java.util.Arrays;
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
		/* Two parallel arrays to hold phone numbers and names
			ith name matches ith phone number; 0 indicates number unknown
			the L tag at the end of the numbers makes them a java long primitive type
			(necessary to fit 10 digits)
			You may extend these arrays but DO NOT modify the types
		 */
        long[] numbers = {9876543210L, 0, 3129152000L, 9094567890L, 3034061234L, 0, 0, 8133774578L};
        String[] names = {"Adam Smith", "George Washington", "Alexander Hamilton", "Thomas Payne",
                "Betsy Ross", "Martha Washington", "Deborah Sampson", "Patience Wright"};

        //TO DO: call the methods to test them. You can call them multiple times. Do some phone changes
        printLine();
        showPhoneNumbers(numbers, names);
        printLine();

        boolean updated = updateNumbers(numbers, names);
        System.out.println("Updated numbers status: " + updated);

    }

    /**
     * Ask the user to update zero or more phone numbers using a Scanner170 object. User enters name
     * of person, if that person found in people parameter, then allow update of corresponding phone number
     * in phoneNumbers parameter.
     *
     * Loop asking for names for which to update the phone number until user enters *Done*
     *
     * @param phoneNumbers - array of phone numbers in order matching names (0 indicates number unknown)
     * @param people - array of people names in same order as phone numbers
     * @return boolean true if any numbers were changed; false if no numbers changed successfully (for
     * 			example if user never enters a name found in people
     *
     * Pseudo Code:
     * 1. Prompt the user for a name
     * 2. Check if the name exists in the people array
     * 3. If not, exit. If so, ask for a new number
     * 4. Update the new number and output the current phone directory
     *
     */
    public static boolean updateNumbers(long[] phoneNumbers, String[] people) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("Please enter the name of the person you'd like to update: ");

        while (stdin.hasNext()) {

            String name = stdin.nextLine();
            int index = Arrays.asList(people).indexOf(name);
            if (index > -1) {
                System.out.print("Please enter " + people[index] + "'s new number: ");
                long num = stdin.nextLong();
                phoneNumbers[index] = num;
                System.out.println(people[index] + "'s updated to " + phoneNumbers[index]);
                printLine();
                showPhoneNumbers(phoneNumbers, people);
                printLine();
            } else {
                System.out.println("That name was not found, exiting.");
                return true;
            }

            System.out.println();
            System.out.print("Please enter the name of the person you'd like to update: ");

        }

        return false;  // temporary so stub compiles.  Replace with your full code for method
    }

    /**
     * Show the full set of names and phone numbers in the format indicated in the assignment
     * (Display them to the console)
     *
     * @param phoneNumbers- array of phone numbers in order matching names (0 indicates number unknown)
     * @param people- array of people names in same order as phone numbers
     *
     * Pseudo Code:
     * 1. Determine the longest name for formatting purposes.
     * 2. Store longest name length plus padding to an int which will be used for left aligning text later
     * 3. Print formatted name
     * 4. Center and format phone numbers to print on the same line
     *
     */
    public static void showPhoneNumbers(long[] phoneNumbers, String[] people) {

        System.out.println("Current Phone Directory:");

        /*
         * This may not be the most efficient way to accomplish this
         * I first loop through all the people to find the longest name
         * I then use that to set the width of my first column with some
         * extra right padding.
         */

        int peopleColumnWidth = 0;
        for (String p : people) if (p.length() > peopleColumnWidth) peopleColumnWidth = p.length();

        peopleColumnWidth += 3; // Increase by 5 for extra padding

        for (int i = 0; i < phoneNumbers.length; i++) {
            System.out.print("| " + leftAlign(people[i], peopleColumnWidth));
            System.out.print(" | " + center(formatNumber(phoneNumbers[i])) + "|\n");

        }

    }

    private static String leftAlign(String string, int width) {
        StringBuilder output = new StringBuilder(string);
        if (string.length() < width) {
            int diff = width - string.length();
            output.append(" ".repeat(diff));
        }
        return output.toString();
    }

    public static String center(String input) {
        StringBuilder output = new StringBuilder();
        int length = input.length();
        int remainder = 15 - length;
        int diff = (15 - length) / 2;
        output.append(" ".repeat(diff)).append(input).append(" ".repeat(diff));
        if (remainder % 2 != 0) output.append(" "); // Fix for non-even lengths
        return output.toString();
    }

    private static String formatNumber(long number) {
        String num = "" + number; // Quick trick to make a string
        if (num.equals("0")) return "*Unknown*";
        StringBuilder output = new StringBuilder();
        char[] numbers = num.toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) output.append("(");
            else if (i == 3) output.append(") ");
            else if (i == 6) output.append("-");
            output.append(numbers[i]);
        }
        return output.toString();
    }

    private static void printLine() {
        System.out.println("-".repeat(80));
    }

}