package AppleAndOrange;

import java.util.List;

public class Result {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        int applesCount = 0;
        for (int i = 0; i < apples.size(); i++) {
            int applePos = a + apples.get(i);
            if (applePos >= s && applePos <= t) {
                applesCount++;
            }
        }
        System.out.println(applesCount);

        int orangesCount = 0;
        for (int i = 0; i < oranges.size(); i++) {
            int orangePos = b+oranges.get(i);
            if (orangePos >= s && orangePos <= t) {
                orangesCount++;
            }
        }
        System.out.println(orangesCount);
    }
}
