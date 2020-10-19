import java.util.Scanner;
import java.util.HashSet;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize;
        int num;
        while (input.hasNext()) {
            arraySize = input.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int[] array = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                num = input.nextInt();
                set.add(i);
                array[i] = num;
            }
            set.remove(0);
            System.out.println(jollyJumpers(array, set, arraySize));

        }
    }

    public static String jollyJumpers(int[] array, HashSet<Integer> set, int arraySize) {
        if (arraySize == 1) {
            return "Jolly";
        }

        for (int i = 0; i < arraySize - 1; i++) {
            int absoluteDifference = Math.abs(array[i] - array[i + 1]);
            set.remove(absoluteDifference);
        }
        if (set.isEmpty())
            return "Jolly";
        else
            return "Not jolly";
    }
}