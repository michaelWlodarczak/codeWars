package seven_kyu.strongestEvenNumber;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        //how to find key in map with largest value

        Map<Integer, Integer> map = new HashMap<>();

        map.put(4, 2);
        map.put(5, 1);
        map.put(6, 3);
        map.put(7, 5);
        map.put(8, 1);

        System.out.println(map);

        int maxValueInMap = (Collections.max(map.values()));
        System.out.println(maxValueInMap);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }

        //oneliner - one line solution of above code
        Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }
}
