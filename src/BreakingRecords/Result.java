package BreakingRecords;

import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        List<Integer> highestAndLowestScore = new ArrayList<>();

        //here we setup the bounds for our biggest and lowest score
        int biggest = scores.get(0);
        int lowest = scores.get(0);


        int biggestCount=0;
        int lowestCount = 0;

        for (int i = 0; i <scores.size(); i++) {

            //checking if the current score is bigger than  the setup one in the beginning
            if (scores.get(i)>biggest){
                //our biggest score is reassigned and counter goes up
                biggest=scores.get(i);
                biggestCount++;
            }else if(scores.get(i)<lowest){
                lowest=scores.get(i);
                lowestCount++;
            }
        }

        highestAndLowestScore.add(biggestCount);
        highestAndLowestScore.add(lowestCount);
        return highestAndLowestScore;
    }
}
