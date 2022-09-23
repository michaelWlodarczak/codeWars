package seven_kyu.metro;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println("Size of list: " + list.size()); // .size() zwraca liczbę elementow w liscie

        list.forEach(array -> System.out.println(Arrays.toString(array))); // drukowanie listy tablic

        String[] food = {"bread", "ham", "cheese"};
        String[] animals = {"hedgehog", "bear", "crab"};
        ArrayList<String[]> list2 = new ArrayList<>();
        list2.add(food);
        list2.add(animals);
        list2.get(0);

        System.out.println(Arrays.toString(food));

    }
}
