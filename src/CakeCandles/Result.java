package CakeCandles;

import java.util.List;

public class Result {
    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int res = 0;
        int biggestNumber =0;
        for (int i = 0; i < candles.size(); i++) {
            if (biggestNumber<candles.get(i)){
                biggestNumber=candles.get(i);
                res=0;
            }
            if (biggestNumber==candles.get(i)){
                res++;
            }
        }
        return res;
    }

}
