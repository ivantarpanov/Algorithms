package HackerLandUniversity;

import java.util.ArrayList;
import java.util.List;

public class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int currentGrade = grades.get(i);
            //first if our grade is less than 38 we add int in the result and continue to the next one
            if (currentGrade<38){
                res.add(currentGrade);
                continue;
            }
            //making our grade to the next multiple of 5
            while (currentGrade%5!=0){
                currentGrade++;
            }
            //after we make the grade to the next multiple we check if we need to round up or not
            if (currentGrade-grades.get(i)<3){
                res.add(currentGrade);
            }else {
                res.add(grades.get(i));
            }
        }
        return res;
    }
}
