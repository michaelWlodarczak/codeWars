package six_kyu.sumsOfParts;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {

        int[] ls = {0, 1, 3, 6, 10};

        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < ls.length; i++) {
            list.add(ls[i]);
        }

        for (int i = 0; i <= list.size(); i++) {
            System.out.println(list);
            list.remove(0);
        }


    }
}
