package KangarooJumps;

public class Result {
    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if(canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand) {
                response = "YES";
            }
        }
        return response;
    }
}
