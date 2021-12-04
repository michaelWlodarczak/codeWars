package seven_kyu.sum;


/*
Beginner Series #3 Sum of Numbers

Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return it.
If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum {

    public int GetSum(int a, int b) {
        int bigger, smaller, sum = 0;
        if (a == b) {
            return a;
        } else if (a>b){
            bigger=a;
            smaller=b;
        }else {
            bigger=b;
            smaller=a;
        }
        for (int i = smaller; i <= bigger ; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //SOME OTHER SOLUTIONS:


//    public int GetSum(int a, int b) {
//        if (a == b) return a;
//        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
//    }

//    public int GetSum(int a, int b) {
//        return (a + b) * (Math.abs(a - b) + 1) / 2;
//    }

//    public static int GetSum(final int a, final int b) {
//        int result = 0;
//
//        if(a != b) {
//            int lowestNumber = a < b ? a : b;
//            int highestNumber = a > b ? a : b;
//
//            for (int i = lowestNumber ; i <= highestNumber; i++) {
//                result += i;
//            }
//        } else {
//            result = a;
//        }
//        return result;
//    }

//    public int GetSum(int a, int b) {
//        return (a==b) ? a : ((Math.abs(b-a)+1)*(b+a)/2);
//    }



    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        if(a==b){
            System.out.println("They are equal: " + a);
        }
        int bigger = 0;
        int smaller = 0;
        if (a > b) {
            bigger = a;
            smaller =b;
        } else {
            bigger = b;
            smaller = a;
        }

        int sum = 0;
        for (int i = smaller; i <= bigger ; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of digits between " + a +" and " + b + " = " + sum);


    }
}

