package MiniMaxSum;

import java.util.Collections;
import java.util.List;

public class Result {
    private List<Integer> arr;



    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for(int i =0;i<arr.size()-1;i++){
            minSum+=arr.get(i);
        }
        for (int i = 1; i < arr.size() ; i++) {
            maxSum+=arr.get(i);

        }
        System.out.println(minSum+" " +maxSum);
    }
}