package six_kyu.sumsOfParts;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        //20, 20, 19, 16, 10, 0

        int[]ls = {0, 1, 3, 6, 10};

//        System.out.println("lenght: " + ls.length);
//        System.out.println("Array ls: " + Arrays.toString(ls));
//        System.out.println("Sum of elements: "+Arrays.stream(ls).sum());
//
//        for (int i = 0; i < ls.length; i++) {
//            System.out.println(Arrays.toString(new int[ls.length-1-i]));
//        }

        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < ls.length; i++) {
            list.add(ls[i]);
        }
        System.out.println(list);
        System.out.println(list.size());

//        System.out.println(list.stream().mapToInt(Integer::intValue).sum());



        for (int i = 0; i <= list.size()+3; i++) {
            list.remove(0);
            System.out.println(list);
        }




    }
}
