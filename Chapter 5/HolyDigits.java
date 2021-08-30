import java.util.*;

public class HolyDigits {
    public static void main(String[] args) {
        generateThousandsPlace();
        generateTensPlace();
        int address = calculateAddress();
        System.out.println("The address is " + address + " Pennsylvania Avenue");
    }

    private static final List<Integer> thousandsPlace = new ArrayList<>();
    private static final List<Integer> tensPlace = new ArrayList<>();

    private static void generateThousandsPlace() {
        // The 4th (Thousands place) digit must be odd, 1-9
        for (int i = 0; i <= 9; i++) if (i % 2 != 0) thousandsPlace.add(i);
    }

    private static void generateTensPlace() {
        // The 2nd (Tens place) must be 1/3 of the 4th digit
        List<Integer> validNumbers = new ArrayList<>();
        for (int num : thousandsPlace) {
            if (num % 3 == 0) {
                tensPlace.add(num / 3);
                validNumbers.add(num);
            }
        }
        thousandsPlace.clear();
        thousandsPlace.addAll(validNumbers);
    }

    private static int calculateAddress() {
        int address = 0;
        for (int thousands : thousandsPlace) {
            for (int tens : tensPlace) {
                for (int ones = 0; ones <= 9; ones++) {
                    for (int hundreds = 0; hundreds <= 9; hundreds++) {
                        int total = ones + tens + hundreds + thousands;
                        if (total == 27) {
                            address = Integer.parseInt("" + ones + tens + hundreds + thousands);
                            break;
                        }
                    }
                }
            }
        }
        return address;
    }
}
