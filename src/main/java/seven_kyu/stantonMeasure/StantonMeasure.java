package seven_kyu.stantonMeasure;

/*
The Stanton measure of an array is computed as follows:
count the number of 1s in the array. Let this count be n.
The Stanton measure is the number of times that n appears in the array.

Write a function which takes an integer array and returns its Stanton measure.

Example
The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3,
because 1 occurs 2 times in the array and 2 occurs 3 times.
 */

import java.util.Arrays;

public class StantonMeasure {
    public static int stantonMeasure(int[] arr) {
        // Your code here
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 1};
        int counter = 0;
        int maxCounter = 0;
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (value == arr[j])
                    counter++;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            System.out.println(counter + "\n");

        }
        System.out.println("max counter: " + maxCounter);

    }
}
