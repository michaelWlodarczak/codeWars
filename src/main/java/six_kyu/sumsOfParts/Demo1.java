package six_kyu.sumsOfParts;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo1 {
        public static void main(String[] args) {

        //20, 20, 19, 16, 10, 0

        int[] ls = {0, 1, 3, 6, 10};

//        System.out.println("Sum of elements: "+Arrays.stream(ls).sum());

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < ls.length; i++) {
//            list.add(ls[i]);
//        }

//        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

//        for (int i = 0; i <= list.size(); i++) {
//            System.out.println(list);
//            list.remove(0);
//        }

            System.out.println(Arrays.toString(ls));
            System.out.println(Arrays.stream(ls).sum());

        for (int k = 0; k < ls.length; k++) {
            int index = k;
            System.out.println(Arrays.toString(IntStream.range(k, ls.length)
                    .filter(i -> i != index)
                    .map(i -> ls[i])
                    .toArray()));
            System.out.println(Arrays.toString(new int[]{Arrays.stream(IntStream.range(k, ls.length)
                    .filter(i -> i != index)
                    .map(i -> ls[i])
                    .toArray())
                    .sum()}));
        }





    }
}
