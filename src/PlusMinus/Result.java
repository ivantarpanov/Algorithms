package PlusMinus;

import java.util.List;

public class Result {
    private List<Integer> arr;


    public static void plusMinus(List<Integer> arr) {
        double countPositive = 0;
        double countNegative = 0;
        double countZero = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                countPositive++;
            } else if (arr.get(i) < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.printf("%.6f\n",countPositive/ arr.size());
        System.out.printf("%.6f\n",countNegative/ arr.size());
        System.out.printf("%.6f",countZero/ arr.size());
    }
}
