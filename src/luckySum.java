/**
 * @Class: luckySum
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 3/26/2023
 */
public class luckySum {
    public int luckySum(int a, int b, int c) {
        if (a == 13){ // if a is 13, 0 is returned
            System.out.println(0);
            return 0;
        }else if(b == 13){
           System.out.println(a);
            return a;
        }else if(c == 13){
            System.out.println(a + b);
            return a + b; // adds a and b if c is 13
        }else{
            System.out.println(a + b + c);
            return a + b + c; // if none are 13 it adds all integers
        }

    }
    public static void
    main(String args[])
    {
        luckySum luckySumObject = new luckySum();
        luckySumObject.luckySum(13, 2, 3);
        luckySumObject.luckySum(1,2,3);

    }
}


