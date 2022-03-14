package TimeConversion;

public class Result {
    public static String timeConversion(String s) {

        if(s.charAt(s.length()-2) == 'A'){
            if((s.substring(0,2)).equals("12"))
                return("00"+s.substring(2,8));

        }else{
            if(!(s.substring(0,2)).equals("12"))
                return(Integer.parseInt(s.substring(0,2))+12+s.substring(2,8));

        }
        return(s.substring(0,8));

    }
}