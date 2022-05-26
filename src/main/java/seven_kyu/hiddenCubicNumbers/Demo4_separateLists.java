package seven_kyu.hiddenCubicNumbers;

import java.util.ArrayList;
import java.util.List;

public class Demo4_separateLists {
    public static void main(String[] args) {

        // two characters
        char c1 = 'A', c2 = '4';

        // Function to check if the character
        // is digit or not
        System.out.println(
                c1 + " is a digit -> "
                        + Character.isDigit(c1));
        System.out.println(
                c2 + " is a digit -> "
                        + Character.isDigit(c2));

//        String str = "nvjiwfid25d387vsnnie873";
        String str = "0 9026315 -827&()";
        List<Character> characters = new ArrayList<>();
        List<Character> numbersOnly = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        System.out.println(characters);
        for (int i = 0; i < characters.size(); i++) {
            System.out.print(Character.isDigit(characters.get(i)) + ", ");
        }
        for (int i = 0; i < characters.size(); i++) {
            if (Character.isDigit(characters.get(i))==true){
                numbersOnly.add(characters.get(i));
            }
        }
        System.out.println(numbersOnly);



    }

}
