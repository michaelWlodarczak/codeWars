package seven_kyu.whoLikesIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
                System.out.println(demo2("H", "M", "K", "J", "B"));
    }

    public static String demo2 (String... names){
        List<String> listOfNames = new ArrayList<>();
        listOfNames = Arrays.asList(names);
        return "list of names: " + listOfNames;
    }
}
