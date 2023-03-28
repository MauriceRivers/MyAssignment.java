/**
 * @Class: hasPalindrome
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class hasPalindrome {
    private static boolean hasPalindrome(String str) {
            int n = str.length();
            for (int i = 0; i < n / 2; i++)
                if (str.charAt(i) != str.charAt(n - i - 1)){
                    return false;}
            return true;
        }

    public static void main(String args[]) {
        String str = "appa";
        String str2 = "hannah hannah";
        String str3 = "poll";
        System.out.println(hasPalindrome(str));
        System.out.println(hasPalindrome(str2));
        System.out.println(hasPalindrome(str3));
    }

}






