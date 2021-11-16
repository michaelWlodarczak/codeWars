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
        // Insert brilliant code here
        return true;
    }

    public static <N> void main(String[] args) {
//        int [] arrayN = {1,0};
//        int [] arrayS = {-1,0};
//        int [] arrayW = {0,-1};
//        int [] arrayE = {0,1};
//
//        Map<int[],Integer> N = new HashMap<>();
//        Map<int[],Integer> S = new HashMap<>();
//        Map<int[],Integer> W = new HashMap<>();
//        Map<int[],Integer> E = new HashMap<>();
//
//        N.put(arrayN,1);
//        S.put(arrayS,1);
//        W.put(arrayW,1);
//        E.put(arrayE,1);

        int value = 0;
        int time = 0;
        char n = 'n';
        char s = 's';
        char w = 'w';
        char e = 'e';

        switch (value){
            case 'n':
                int [] arrayN = {1,0};
                value = Arrays.stream(arrayN).sum();
                time = 1;
                break;
            case 's':
                int [] arrayS = {-1,0};
                value = Arrays.stream(arrayS).sum();
                time = 1;
                break;
            case 'w':
                int [] arrayW = {0,-1};
                value = Arrays.stream(arrayW).sum();
                time = 1;
                break;
            case 'e':
                int [] arrayE = {0,1};
                value = Arrays.stream(arrayE).sum();
                time = 1;
                break;
        }




//        System.out.println(N.values());
//        System.out.println(S.values());
//        System.out.println(W.values());
//        System.out.println(E.values());

//        System.out.println(Arrays.stream(arrayN).sum());



    }
}
