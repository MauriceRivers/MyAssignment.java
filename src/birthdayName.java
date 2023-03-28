/**
 * @Class: birthdayName
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class birthdayName {
    public String birthdayName(String name){

        System.out.println("Happy Birthday " + name + "!");
        return "Happy birthday " + name + "!";
        // displays  Happy Birthday string
        // with name added to it
    }



    public static void
    main(String args[])
    {
    birthdayName birthdayNameObject = new birthdayName();
        String str = "Juan";
        birthdayNameObject.birthdayName(str);
    }
}
