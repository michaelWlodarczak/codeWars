package seven_kyu.whoLikesIt;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        String name1 = "Hania";
        String name2 = "Michal";
        String name3 = "Krzysztof";
        String name4 = "Józef";
        String name5 = "Bogusia";
        String name6 = "Ania";

        List<String> names = new ArrayList<>();

        System.out.println(names);
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);
        System.out.println(names);
        System.out.println(names.size());


        if (names.size() == 1) {
            System.out.println(names.get(0) + " likes this");
        } else if (names.size() == 2) {
            System.out.println(names.get(0) + " and " + names.get(1) + " like this");
        } else if (names.size() == 3) {
            System.out.println(names.get(0) + ", " + names.get(1) +
                    " and " + names.get(2) + " like this");
        } else if (names.size() >= 4) {
            System.out.println(names.get(0) + ", " + names.get(1) + " and " + (names.size() - 2) + " others like this");
        } else {
            System.out.println("no one likes this");
        }
    }
}
