/**
 * @Class: swapEnds
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class swapEnds {
    public String swapEnds(String str) {
        if(str.length() < 2){
           System.out.println(str);
            return str; //displays given string if length is less than 2
        }else{
            System.out.println(str.substring(str.length() - 1) +
                    str.substring(1, str.length() - 1) + str.substring(0, 1));


            return (str.substring(str.length() - 1) +
                    str.substring(1, str.length() - 1) + str.substring(0, 1));
            //takes the String provided and takes last character and places it at
            //the front, then adds the middle of the string backwards
            //then places the previous first character and the last one
        }
    }

    public static void main(String args[]) {
        swapEnds swapEndsObject = new swapEnds();
        String str = "hello";
        swapEndsObject.swapEnds(str);

    }
}
