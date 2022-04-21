package seven_kyu.arrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
Your goal in this kata is to implement a difference function,
which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class ArrayDiff {
            public static int[] arrayDiff(int[] a, int[] b) {
                List<Integer> listA = new ArrayList<>();
                List<Integer> listB = new ArrayList<>();

                for (int x:a){
                    listA.add(x);
                }
                for (int x:b){
                    listB.add(x);
                }

                listA.removeAll(listB); // this line did a job! ;)

                int[] array = new int[listA.size()];

                int k = 0;
                for (int i: listA) {
                    array[k++] = i;
                }

                Arrays.toString(array);
                return array;
            }

            //ONELINER:

//    public static int[] arrayDiff(int[] a, int[] b) {
//        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
//    }


}
