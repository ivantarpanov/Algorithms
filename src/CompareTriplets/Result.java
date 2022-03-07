package CompareTriplets;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }
        result.add(alicePoints);
        result.add(bobPoints);
        return result;
    }

}
