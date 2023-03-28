/**
 * @Class: fibonacci
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class fibonacci {
    private static int fibonacci(int n) {
        int m = n,  firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) { //counts from 1 and everytime it runs
                                       // the previous number is increased by 1
                                       // until you reach the input integer n
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;// as the loop runs, the next term is the previous 2 terms
                                  // added together, and then places that created next term
                                  // into the second term and the previous second term is
                                  // placed into the first term, and the first term is displayed
        }
        return firstTerm;


    }

    public static void main(String args[]) {
        int integer = 9;
        System.out.println(fibonacci(integer));

    }

}
