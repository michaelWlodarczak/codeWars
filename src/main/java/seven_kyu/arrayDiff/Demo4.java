package seven_kyu.arrayDiff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
//        Set<Integer> setC = new HashSet<>();
//        setC.add(1);
//        setC.add(2);
//        setC.add(3);
//        setC.add(2);
//
//        setC.forEach(System.out::println);
//
//        for(Object s : setC){
//            System.out.println(s);
//        }

        int[] a = {1, 2, 2, 3};
        int[] b = {1};

        Set<int[]> setA = new HashSet<int[]>(Arrays.asList(a));
        Set<int[]> setB = new HashSet<>(Arrays.asList(b));

//        Set<int[]> commonOnes = setA.retainAll(setB);
//        setA.retainAll(setB);
//        setA.removeAll(setA.retainAll(setB)).add(setB.removeAll(setA.retainAll(setB)));

        setA.forEach(System.out::print);
        for (int[] s : setA){
            System.out.println(s);
        }


    }
}