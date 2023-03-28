/**
 * @Class: nonStart
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class nonStart {
    public String nonStart(String a, String b) {
        if(a.length() < 2 || b.length() < 2){ //only quotations printed when
                                              // length is smaller than 2 characters
           System.out.println("");
            return "";
        }else{
            System.out.println(a.substring(1,a.length()) + b.substring(1,b.length()));
            return a.substring(1,a.length()) + b.substring(1,b.length());
            //adds the two strings together without their first characters
            // to create one string
        }
    }

    public static void main(String args[]) {
       nonStart nonStartObject = new nonStart();
        String strA = "Hello";
        String strB = "There";
        nonStartObject.nonStart(strA, strB);


    }



}
