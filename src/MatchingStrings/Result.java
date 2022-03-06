package MatchingStrings;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> res =new ArrayList<>();

        for(int i=0;i<queries.size();i++){
            int count=0;
            for(int j=0;j<strings.size();j++){
                if(strings.get(j).equals(queries.get(i)))
                    count++;
            }
            res.add(count);
        }
        return res;
    }
}
