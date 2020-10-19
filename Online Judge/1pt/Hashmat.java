import java.util.Scanner;

public class Hashmat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            long firstArmy = input.nextLong();
            long secondArmy = input.nextLong();
            long difference = Math.abs(firstArmy - secondArmy);
            System.out.println(difference);
        }
    }
}