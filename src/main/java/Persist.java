/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */

import java.io.Console;

public class Persist { //TODO ;/
    public static int persistence(long n) {
        // your code
        return (int) n;
    }
//    public static int persistence(long n) {
//        int result = 0;
//        while (n > 9) {
//            long multi = 1;
//            for (char t : String.valueOf(n).toCharArray()) {
//                multi *= Long.parseLong(String.valueOf(t));
//            }
//            n = multi;
//            result++;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        long n = 999;
        int result = 0;
        String txt = String.valueOf(n);
        while (n>9){
            long mult = 1;
            for (int i = 0; i < txt.toCharArray().length; i++) {
                mult *= txt.charAt(i);
            }
            n = mult;
            result++;
        }
        System.out.println(result);
        System.out.println(n);


    }
}
