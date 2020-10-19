import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = 1;
        while (true) {
            double input = scanner.nextDouble();
            if (input < 0) {
                break;
            }

            System.out.printf("Case %d: %d\n", caseNum++, (int) Math.ceil(Math.log(input) / Math.log(2)));

        }

    }
}
