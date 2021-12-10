package seven_kyu.strongestEvenNumber;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        int n = 48;
        int m = 56;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n; i <= m; i++) {
            map.put(i,count);
        }
        System.out.println(map);
        for (int i = 0; i < map.size(); i++) {
            int x = map.get(i);
            while (x >= 2) {
                if (x % 2 != 0)
                    break;
                x=x/2;
                count++;
            }
            System.out.println(map);
        }


//        Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//        System.out.println("max key: " + key);
    }
}
