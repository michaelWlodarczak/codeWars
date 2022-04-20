package seven_kyu.strongestEvenNumber.arraySolution;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        int n = 3;
        int m = 13;
        int maxCount = 0;
        int maxElement = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            list.add(i);
        }

        int [] array = new int[list.size()]; //Converting list to array in traditional way for primitive types
        for (int i = 0; i < list.size(); i++) {
            array[i]= list.get(i);
        }
                for (int x:array) {
            System.out.println(x);
        }


        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int count = 0;
            while (x >= 2) {
                if (x % 2 != 0)
                    break;
                x=x/2;
                count++;
            }
            if (maxCount < count){
                maxCount=count;
                maxElement=array[i];
            }
            System.out.println("element: " + list.get(i) + " counter: " + count);

        }
        System.out.println("\nMax Counter: " + maxCount);
        System.out.println("\nMax Element: " + maxElement);
    }
}
