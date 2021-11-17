/*
You live in the city of Cartesia where all roads are laid out in a perfect grid.
You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
The city provides its citizens with a Walk Generating App on their phones
-- everytime you press the button it sends you an array of
one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
You always walk only a single block for each letter (direction) and you know it takes you one minute
to traverse one city block, so create a function that will return true if the
walk the app gives you will take you exactly ten minutes (you don't want to be early or late!)
and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of
direction letters ('n', 's', 'e', or 'w' only).
It will never give you an empty array (that's not a walk, that's standing still!).
 */

import java.util.*;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int value = 0;
        int time = 0;
        int[] arrayN = {1, 0};
        int[] arrayS = {-1, 0};
        int[] arrayW = {0, -1};
        int[] arrayE = {0, 1};

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                time++;
                int valueN = Arrays.stream(arrayN).sum();
                value += valueN;
            } else if (walk[i] == 's') {
                time++;
                int valueS = Arrays.stream(arrayS).sum();
                value += valueS;
            } else if (walk[i] == 'w') {
                time++;
                int valueW = Arrays.stream(arrayW).sum();
                value += valueW;
            } else if (walk[i] == 'e') {
                time++;
                int valueE = Arrays.stream(arrayE).sum();
                value += valueE;
            }
        }
        if (value == 0 && time == 10) {
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
//        int[] arrayN = {1, 0}; // 5
//        int[] arrayS = {-1, 0}; //-1
//        int[] arrayW = {0, -1}; // 3
//        int[] arrayE = {0, 1}; // 1
//
//        System.out.println("arrayN: " + Arrays.stream(arrayN).sum());
//        System.out.println("arrayS: " + Arrays.stream(arrayS).sum());
//        System.out.println("arrayW: " + Arrays.stream(arrayW).sum());
//        System.out.println("arrayE: " + Arrays.stream(arrayE).sum());
//
//        int[] arrays = {Arrays.stream(arrayN).sum(), Arrays.stream(arrayS).sum(), Arrays.stream(arrayW).sum(), Arrays.stream(arrayE).sum()};
//        System.out.println("Total sum: " + Arrays.stream(arrays).sum() + "\n");
//
//        char[] walk = {'n', 's', 'w', 'e'};
//        int value = 0;
//        int time = 0;
//
//        for (int i = 0; i < walk.length; i++) {
//            if (walk[i] == 'n') {
//                time++;
//                int valueN = Arrays.stream(arrayN).sum();
//                value += valueN;
//            } else if (walk[i] == 's') {
//                time++;
//                int valueS = Arrays.stream(arrayS).sum();
//                value += valueS;
//            } else if (walk[i] == 'w') {
//                time++;
//                int valueW = Arrays.stream(arrayW).sum();
//                value += valueW;
//            } else if (walk[i] == 'e') {
//                time++;
//                int valueE = Arrays.stream(arrayE).sum();
//                value += valueE;
//            }
//        }
//        System.out.println("Value: " + value);
//        System.out.println("Time: " + time);


//        int [] arr = {1,2,3};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            //sum = sum + arr[i];
//        }
//        System.out.println(sum);

//        if (value == 0 && time == 10) {
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }

        TenMinWalk tenMinWalk = new TenMinWalk();
        System.out.println(TenMinWalk.isValid(new char[]{'n', 's', 'w', 'e'}));
        System.out.println(TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(TenMinWalk.isValid(new char[]{'w'}));
        System.out.println(TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
