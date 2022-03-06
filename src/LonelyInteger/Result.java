package LonelyInteger;

import java.util.Collections;
import java.util.List;

public class Result {
    public static int lonelyinteger(List<Integer> a) {

        Collections.sort(a);
        int theChosenOne=0;
        if (a.size()==1){
            theChosenOne=a.get(0);
            return theChosenOne;
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i)!=a.get(j)){
                    if (a.get(j)%2!=0){
                        theChosenOne=a.get(j);
                    }
                }
            }
        }
        return theChosenOne;
    }
}
