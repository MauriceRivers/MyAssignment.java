/**
 * @Class: everyOther
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class everyOther {
    private static String everyOther(String str) {
        String X = "";
        if(str.length() < 2){
            return str;
        }else{
            for(int i = 0; i <= str.length(); i += 2){
                X += str.charAt(i); //for loop that skips a character
                                    // every time it runs then puts the character
                                    // in String X.
            }
            return X;
        }
    }

    public static void main(String args[]) {
        String str = "hello";
        System.out.println(everyOther(str));
    }



}

