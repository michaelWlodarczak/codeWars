package seven_kyu.strongestEvenNumber;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        int n = 48;
        int m = 56;
        int maxCount = 0;
        int maxElement = 0; // <- ta linijka zrobila robote ;)

        List<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            int count = 0;
            while (x >= 2) {
                if (x % 2 != 0)
                    break;
                x=x/2;
                count++;
            }
            if (maxCount < count){
                maxCount=count;
                maxElement=list.get(i);
            }
            System.out.println("element: " + list.get(i) + " counter: " + count);

        }
        System.out.println("\nMax Counter: " + maxCount);
        System.out.println("\nMax Element: " + maxElement);
    }
}
