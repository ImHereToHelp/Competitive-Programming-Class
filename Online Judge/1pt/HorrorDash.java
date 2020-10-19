import java.util.Scanner;

public class HorrorDash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = input.nextInt();
        for (int i = 1; i <= numTestCases; i++) {
            int arraySize = input.nextInt();
            int max = 0;
            for (int j = 0; j < arraySize; j++) {
                int speed = input.nextInt();
                if (speed > max) {
                    max = speed;
                }
            }
            System.out.printf("Case %d: %d\n", i, max);
        }
    }
}