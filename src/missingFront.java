/**
 * @Class: missingFront
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */

public class missingFront {
    private static String missingFront(String str){
        return str.substring(3);
        //.substring(3) removes first 3 character in String str
    }

    public static void main(String args[]) {
        String str = "Holiday";

        System.out.println(missingFront(str));

    }






}


