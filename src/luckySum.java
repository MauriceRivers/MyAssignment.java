/**
 * @Class: luckySum
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class luckySum {
    private static int luckySum(int a, int b, int c) {
        if (a == 13){ // if a is 13, 0 is returned
            return 0;
        }else if(b == 13){
            return a;
        }else if(c == 13){
            return a + b; // adds a and b if c is 13
        }else{
            return a + b + c; // if none are 13 it adds all integers
        }

    }
    public static void
    main(String args[])
    {



        System.out.println(luckySum(13, 2, 3 ));

    }
}


