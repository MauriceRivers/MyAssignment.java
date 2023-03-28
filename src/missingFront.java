/**
 * @Class: missingFront
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */

public class missingFront {
    public String missingFront(String str){
        System.out.println(str.substring(3));
        return str.substring(3);
        //.substring(3) removes first 3 character in String str
    }

    public static void main(String args[]) {
        missingFront missingFrontObject = new missingFront();
        String str = "Holiday";
        missingFrontObject.missingFront(str);

    }






}


