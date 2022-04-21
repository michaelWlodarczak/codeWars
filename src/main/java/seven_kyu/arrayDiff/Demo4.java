package seven_kyu.arrayDiff;

import java.util.Arrays;
import java.util.HashSet;

public class Demo4 {
    public static void main(String[] args) {

        int[] a = {1,3,4,8,9};
        int[] b = {1,2,5,8};

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " +Arrays.toString(b));

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int x:a){
            setA.add(x);
        }
        for (int x:b){
            setB.add(x);
        }

        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);

        setA.removeAll(setB);
        System.out.println("setA after removing duplicates from setB: " + setA);

        System.out.println("Converting set to array: ");
        Object[] array = setA.toArray();
        System.out.println(Arrays.toString(array));



    }
}