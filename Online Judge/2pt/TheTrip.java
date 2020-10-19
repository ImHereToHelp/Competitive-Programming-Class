import java.util.*;
import java.math.*;

public class TheTrip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Get number of students
        int numStudents = input.nextInt();
        while (numStudents != 0) {
            // Array is ideal data structure to store expenses
            double[] students = new double[numStudents];
            // Get input into array
            for (int expense = 0; expense < numStudents; expense++) {
                students[expense] = input.nextDouble();
            }
            // Print out output
            System.out.printf("$%.2f\n", findMoneyExchanged(students));
            // Get next outputs number of students (If 0 then while loop ends);
            numStudents = input.nextInt();
        }
    }

    public static double findMoneyExchanged(double array[]) {
        double amountToDistribute = 0D; // Red shaded area
        double amountToReceive = 0D; // Blue shaded area

        double mean = meanOfArray(array); // We'll look at this function later its boring

        // Find out how big the red/blue shaded areas are
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mean) {
                amountToReceive = amountToReceive + (mean - array[i]);
            } else if (array[i] > mean) {
                amountToDistribute = amountToDistribute + (array[i] - mean);
            }
        }
        // Ok we found out how big they are.
        // But due to rounding, they arent guaranteed to be the same, so which one
        // represents the answer?

        // If they are different.
        if (amountToDistribute > amountToReceive) {
            // If rounding made the blue shaded area be 0
            if (amountToReceive == 0) {
                // This fixes it (magic)
                return amountToDistribute - mean;
            } else {
                return amountToReceive;
            }
            // If they are the same, then we go to the else part.
        } else {
            return amountToDistribute; // If same we go here
        }
    }

    public static double meanOfArray(double array[]) {
        double sum = 0;
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        BigDecimal bd = new BigDecimal(sum / length).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
