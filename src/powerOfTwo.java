/**
 * @Class: powerOfTwo
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class powerOfTwo {
    private static boolean isPowerOfTwo(int n) {
        do {
            if (n != 0 && ((n & (n - 1)) == 0)) {
                // checks if n does NOT equal 0, then uses the function n & n - 1
                // to check the binary number, and if that equals
                // 0 on a binary level, then it will return the true
                return true;
            }


        } while (n == 0); // if the binary value does not equal 0 it moves outside
        //  the if statement to the while and will return a false
        return false;
    }

    public static void main(String[] args) {
        int integer = 2;
        int integer2 = 17;
        int integer3 = 16;

        System.out.println(isPowerOfTwo(integer));
        System.out.println(isPowerOfTwo(integer2));
        System.out.println(isPowerOfTwo(integer3));
    }
}





