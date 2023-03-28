/**
 * @Class: birthdayName
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class birthdayName {
    private  static String birthdayName(String name){

        return "Happy Birthday " + name + "!"; // displays  Happy Birthday string
                                               // with name added to it
    }



    public static void
    main(String args[])
    {
        String str = "Juan";

       System.out.println(birthdayName(str));
    }
}
