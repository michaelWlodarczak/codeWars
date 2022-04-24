package seven_kyu.whoLikesIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You probably know the "like" system from Facebook and other pages.

People can "like" blog posts, pictures or other items.
We want to create the text that should be displayed next to such an item.

Implement the function which takes an array containing the names of people that like an item.
It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

Note: For 4 or more names, the number in "and 2 others" simply increases.
 */
public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames = Arrays.asList(names);
        if (listOfNames.size() == 1) {
            return listOfNames.get(0) + " likes this";
        } else if (listOfNames.size() == 2) {
            return listOfNames.get(0) + " and " + listOfNames.get(1) + " like this";
        } else if (listOfNames.size() == 3) {
            return listOfNames.get(0) + ", " + listOfNames.get(1) +
                    " and " + listOfNames.get(2) + " like this";
        } else if (listOfNames.size() >= 4) {
            return listOfNames.get(0) + ", " + listOfNames.get(1)
                    + " and " + (listOfNames.size() - 2) + " others like this";
        } else {
            return "no one likes this";
        }
    }

    //OTHER SOLUTION:

//    public static String whoLikesIt(String... names) {
//        switch (names.length) {
//            case 0: return "no one likes this";
//            case 1: return String.format("%s likes this", names[0]);
//            case 2: return String.format("%s and %s like this", names[0], names[1]);
//            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
//            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
//        }
//    }

    //oneliner:
//    public static String whoLikesIt(String... names) {
//            return names.length == 0 ? "no one likes this" : names.length == 1 ? names[0] + " likes this" : names.length == 2 ? names[0] + " and " + names[1] + " like this" : names.length == 3 ? names[0] + ", " + names[1] + " and " + names[2] + " like this" : names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
//       }


}
