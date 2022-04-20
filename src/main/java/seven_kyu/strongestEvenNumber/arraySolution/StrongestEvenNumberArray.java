package seven_kyu.strongestEvenNumber.arraySolution;

import java.util.ArrayList;
import java.util.List;

public class StrongestEvenNumberArray {
    public static int strongestEven(int n, int m) {
        int maxCount = 0;
        int maxElement = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            list.add(i);
        }
        int [] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i]= list.get(i);
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
        }
        return maxElement;
    }
}

//TODO - problemis solved, however not passing time in code wars - Execution Timed Out (16000 ms)
