package eight_kyu.persist;/*
Write a function, persistence, that takes in a positive parameter num and returns
its multiplicative persistence, which is the number of times you must multiply
the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 */

import java.io.Console;

public class Persist {
    public static int persistence(long n) {
        int counter = 0;
        //Convert to STRING TO GET TO ARRAY
        // kilka sposóbw na to jest
        // https://stackoverflow.com/questions/8033550/convert-an-integer-to-an-array-of-digits
        String str = String.valueOf(n);

        //jeśli ciąg dłuższy niż jeden to wrzuć to w array
        while (str.length() > 1){
            int tmp = 1;
            char[] number = str.toCharArray();
            for (char digit: number){
                tmp = Character.getNumericValue(digit) * tmp;
            }
            counter ++;
            System.out.println("Licznik "+counter);
            str = String.valueOf(tmp);
            System.out.println("Wynik ostatniego mnożenia: "+str);
        }
        return counter;
        //return (int) n;
    }

    public static void main(String[] args) {



    }
}
