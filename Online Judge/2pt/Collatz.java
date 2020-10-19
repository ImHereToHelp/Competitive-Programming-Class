import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int maxCycles = 1;
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            int lowerBound = Math.min(input1, input2);
            int upperBound = Math.max(input1, input2);

            for (int i = lowerBound; i <= upperBound; i++) {
                int cycles = numCycles(i);
                if (cycles > maxCycles) {
                    maxCycles = cycles;
                }
            }

            System.out.println(input1 + " " + input2 + " " + maxCycles);
        }
        scanner.close();

    }

    public static int numCycles(int num) {
        int cycles = 1;
        while (num != 1) {
            if (isEven(num))
                num = num / 2;
            else
                num = 3 * num + 1;

            cycles++;
        }
        return cycles;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}
