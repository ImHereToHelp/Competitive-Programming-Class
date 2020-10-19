import java.math.BigInteger;
import java.util.Scanner;

class SquareRoot {
    public static BigInteger bigSqrt(BigInteger num) {

        if (num.compareTo(new BigInteger("0")) == 0)
            return num;
        if (num.compareTo(new BigInteger("1")) == 0)
            return num;

        BigInteger start = new BigInteger("0");
        BigInteger end = new BigInteger(num.toString());
        BigInteger mid;
        while (start.compareTo(end) < 1) {
            mid = start.add(end).divide(new BigInteger("2"));
            if (mid.multiply(mid).compareTo(num) == 0)
                return mid;

            if (mid.multiply(mid).compareTo(num) == -1) {
                start = mid.add(new BigInteger("1"));
            } else
                end = mid.subtract(new BigInteger("1"));
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = input.nextInt();
        for (int i = 0; i < numTestCases; i++) {
            BigInteger bigNum = new BigInteger(input.next());
            if (i == (numTestCases - 1)) {
                System.out.printf("%s\n", bigSqrt(bigNum).toString());
                break;
            }
            System.out.printf("%s\n\n", bigSqrt(bigNum).toString());
        }
    }
}