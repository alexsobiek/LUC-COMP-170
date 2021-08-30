/*

Alexander Sobiek
COMP 170
Dr. Honig
2/18/2021

*/

public class Calendar {

    public static void main(String[] args)  {
        makeMonth("Tue", 31);

        log("\nI made this program to be dynamic. I'll demonstrate here:\n");

        log("Calendar with 30 days starting on Saturday:");
        makeMonth("Sat", 30);

        log("\nCalendar with 28 days starting on Sunday:");
        makeMonth("Sun", 28);

        log("\nCalendar with 31 days starting on Friday:");
        makeMonth("Fri", 31);

        log("\nJust for fun, a calendar with 65 days starting on Monday:");
        makeMonth("Mon", 65);

    }

    public static int getWidth() { //This is used for centering items within the table
        return 8;
    }

    public static void makeMonth(String startDay, int days) {
        int offset = 0;
        startDay = startDay.toUpperCase();
        switch(startDay) {
            case "SUN":
                break;
            case "MON":
                offset = 1;
                break;
            case "TUE":
                offset = 2;
                break;
            case "WED":
                offset = 3;
                break;
            case "THU":
                offset = 4;
                break;
            case "FRI":
                offset = 5;
                break;
            case "SAT":
                offset = 6;
                break;
            default:
                System.err.println("Invalid startDay for makeMonth()");
                System.exit(1);
        }

        int rows = (days + offset) / 7;
        int firstDate = 1;
        int lastDate = (firstDate + 6) - offset;
        log(makeHeader());
        log(makeBorder());
        for (int i = 0; i <= rows; i++) {

            if (lastDate > days) lastDate = days;
            if (firstDate > lastDate) break;

            log(makeRow(firstDate, lastDate));
            firstDate += (7 - offset);
            lastDate = firstDate + 6;
            offset = 0;
        }
        log(makeBorder());
    }

    public static String makeHeader() {
        StringBuilder output = new StringBuilder();
        output.append(center("Sun"));
        output.append(center("Mon"));
        output.append(center("Tue"));
        output.append(center("Wed"));
        output.append(center("Thu"));
        output.append(center("Fri"));
        output.append(center("Sat"));
        return output.toString();
    }

    public static String makeBorder() {
        int width = getWidth();
        StringBuilder output = new StringBuilder("+");
        for (int i = 0; i < 7; i++) {
            for (int index = 0; index < width; index++) {
                output.append("-");
            }
            output.append("+");
        }
        return output.toString();
    }

    public static String makeRow(int start, int end) {
        StringBuilder output = new StringBuilder("|");
        int difference = end - start;
        int blanks = 7 - end;
        if (blanks > 0) {
            for (int i = 0; i < blanks; i++) {
                //Create blank days
                output.append(createCell(0)).append("|");
            }
        }
        for (int i = 0; i <= difference; i++) {
            output.append(createCell(start)).append("|");
            start++;
        }
        if (blanks < 0) {
            blanks = 6 - difference;
            for (int i = 0; i < blanks; i++) {
                //Create blank days
                output.append(createCell(0)).append("|");
            }
        }
        return output.toString();
    }

    public static String createCell(int day) {
        String output;
        if (day > 0) {
            output = ""+day;
        } else {
            output = " ";
        }
        output = center(output);
        return output;
    }

    public static String center(String input) {
        StringBuilder output = new StringBuilder(input);
        int length = input.length();
        int difference = getWidth() - length;
        if (length == 1) {
            output.insert(0, " ");
        } else if (length > 2) {
            difference++;
        }
        for (int i = 0; i < difference / 2; i++) {
            output.insert(0, " ");
            output.append(" ");
        }
        return output.toString();
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}