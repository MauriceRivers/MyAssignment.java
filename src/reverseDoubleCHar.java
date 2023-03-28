/**
 * @Class: reverseDoubleChar
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class reverseDoubleCHar {
    private static String reverseDoubleCHar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) { //goes from last character
                                                       // to first
            result += word.substring(i, i + 1) + word.substring(i, i + 1);
            //places the original and a duplicate character into result,
            //and keeps running the loop until reaching last character of
            //the String word

        }
        return result;
    }

    public static void main(String args[]) {
        String str = "The";
        System.out.println(reverseDoubleCHar(str));
    }
}
