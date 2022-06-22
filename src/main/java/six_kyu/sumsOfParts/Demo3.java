package six_kyu.sumsOfParts;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

        int[] ls = {0, 1, 3, 6, 10};
        ArrayList<Integer> sum = new ArrayList<>();

        ArrayList<Integer>list = new ArrayList<>();
        for (int x : ls){
            list.add(x);
        }

        for (int i = 0; i < ls.length; i++) {
//            System.out.println(list);
//            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            sum.add(list.stream().mapToInt(Integer::intValue).sum());
            list.remove(0);
        }
        sum.add(0);
        System.out.println(sum);

        int[] b = new int[sum.size()];
        for (int i = 0; i < sum.size(); i++) {
            b[i]=sum.get(i);
        }
        System.out.println(Arrays.toString(b));




    }
}
