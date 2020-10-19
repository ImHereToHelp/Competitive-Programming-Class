import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int power = scanner.nextInt();
            int numVariables = scanner.nextInt();
            int k[] = new int[numVariables];

            for (int i = 0; i < numVariables; i++) {
                k[i] = scanner.nextInt();
            }

            System.out.println(multinomialCombination(power, k));
        }
        scanner.close();
    }

    public static int multinomialCombination(int n, int[] k) {
        int denominator = 1;
        for (int i = 0; i < k.length; i++) {
            denominator = denominator * factorial(k[i]);
        }
        return factorial(n) / denominator;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}