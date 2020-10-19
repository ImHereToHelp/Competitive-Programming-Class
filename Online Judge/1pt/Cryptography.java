import java.util.*;
import java.math.*;

public class Cryptography {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            double exponent = input.nextDouble();
            double result = input.nextDouble();

            double base = Math.pow(result, 1 / exponent);
            System.out.printf("%.0f\n", base);
        }

    }
}