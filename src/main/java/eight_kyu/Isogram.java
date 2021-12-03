package eight_kyu;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter casing)
 */
public class Isogram {
    public static boolean isIsogram(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equalsIgnoreCase(str.substring(j, j + 1))) {
                    count++;
                }
            }
        }
        if (count==0){
            return true;
        }else {
            return false;
        }
    }

//    ONE LINE SOLUTION:
//    public static boolean isIsogram(String str) {
//        return str.length() == str.toLowerCase().chars().distinct().count();
//    }

    public static void main(String[] args) {
        String str = "moose";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.substring(i, i + 1).equalsIgnoreCase(str.substring(j, j + 1))) {
                        count++;
                    }
                }
            }
            System.out.println(count);

        if (count==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
