package seven_kyu.simpleStringCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {

        String word = "path";

        Pattern pattern = Pattern.compile("[a-z]");

        Matcher matcher = pattern.matcher(word);
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match found");
        }else {
            System.out.println("Match not found");
        }

    }
}
