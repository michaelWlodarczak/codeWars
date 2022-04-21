package seven_kyu.arrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {

        int[] a = {1,2,2,5,9};
        int[] b = {2,5,8};

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " +Arrays.toString(b));

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int x:a){
            listA.add(x);
        }
        for (int x:b){
            listB.add(x);
        }

        System.out.println("listA: " + listA);
        System.out.println("listB: " + listB);

        listA.removeAll(listB);
        System.out.println("listA after removing duplicates from listB: " + listA);

        System.out.println("Converting list to array: ");
        Integer[] array = listA.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println("NOTE! Version with list is more suitable than with set, because set is removing all duplicates.");


    }
}