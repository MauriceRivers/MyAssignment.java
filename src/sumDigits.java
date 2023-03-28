/**
 * @Class: sumDigits
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class sumDigits {
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0){
            sum = sum + n % 10;
            n = n/10;
            //while loop runs while n does NOT equal 0, teh loop
            // takes remainder of the integer provided
            // when it is divided by 10
            // by using % and adds and stores it to the sum integer
            // outside the loop, then n is divided by 10, and since it is an integer
            // it rounds to the whole number, and keeps doing the loop until it
            //equals 0 then it returns the integer sum that has stored the values
        } System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {
        sumDigits sumDigitsObject = new sumDigits();
        int integer = 13;
        sumDigitsObject.sumDigits(integer);

    }


}
