package DiagonalDifference;

import java.util.List;

public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            int leftDiagonal = 0;
            int rightDiagonal =0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal+=arr.get(i).get(i);
            rightDiagonal+=arr.get(i).get(arr.size()-(1+i));
        }

            return Math.abs(leftDiagonal-rightDiagonal);
    }
}