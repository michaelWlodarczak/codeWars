package seven_kyu.pairOfGloves;

import java.util.HashSet;
import java.util.Set;

/*
Pair of gloves
Winter is coming, you must prepare your ski holidays.
The objective of this kata is to determine the number
of pair of gloves you can constitute from the gloves you have in your drawer.

Given an array describing the color of each glove,
return the number of pairs you can constitute,
assuming that only gloves of the same color can form pairs.

Examples:
input = ["red", "green", "red", "blue", "blue"]
result = 2 (1 red pair + 1 blue pair)

input = ["red", "red", "red", "red", "red", "red"]
result = 3 (3 red pairs)

 */
public class PairOfGloves {
    public static int numberOfPairs(String[] gloves) {
        int counterArray = 0;
        for (int i = 0; i < gloves.length; i++) {
            for (int j = i + 1; j < gloves.length; j++) {
                if (gloves[i] == gloves[j]) {
                    counterArray++;
                }
            }
        }
        if (counterArray == 1) {
            return counterArray;
        } else if (counterArray % 2 == 0) {
            return counterArray / 2;
        } else {
            return ((counterArray - 1) / 2);
        }
    }

    public static void main(String[] args) {

        String[] gloves = {"green", "green", "red", "blue", "yellow", "green", "blue"};
        String[] gloves2 = {"gray", "black", "purple", "purple", "gray", "black"};

        System.out.println(numberOfPairs(gloves));
        System.out.println(numberOfPairs(gloves2));
    }
}
