/**
 * @Class: nonStart
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class nonStart {
    private static String nonStart(String a, String b) {
        if(a.length() < 2 || b.length() < 2){ //only quotations printed when
                                              // length is smaller than 2 characters
            return "";
        }else{
            return a.substring(1,a.length()) + b.substring(1,b.length());
            //adds the two strings together without their first characters
            // to create one string
        }
    }

    public static void main(String args[]) {
        String strA = "Hello";
        String strB = "There";

        System.out.println(nonStart(strA, strB));
    }



}
