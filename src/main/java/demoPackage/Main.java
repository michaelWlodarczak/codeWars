package demoPackage;//class used only for random test and/or solutions

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        String k = "Krzys";
        String h = "Haniut";
        String m = "Mis";

        arrayList.add(k);
        arrayList.add(m);
        arrayList.add(h);
        arrayList.add(k);

        System.out.println(arrayList);

        linkedList.add(k);
        linkedList.add(m);
        linkedList.add(h);
        linkedList.add(k);

        System.out.println(linkedList);
        arrayList.remove(k);
        linkedList.remove(k);
        System.out.println(arrayList);
        System.out.println(linkedList);
        arrayList.remove(h);
        linkedList.remove(h);
        System.out.println(arrayList);
        System.out.println(linkedList);


    }
}
