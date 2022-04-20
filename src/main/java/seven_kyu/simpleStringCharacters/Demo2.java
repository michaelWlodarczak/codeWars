package seven_kyu.simpleStringCharacters;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        String word = "CbgA5<1d-tOwUZTS8yQ";

        int largeLetterCount = 0;
        int smallLetterCount = 0;
        int numberCount = 0;
        int specialMarkCount = 0;

        Pattern pattern1 = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Pattern pattern3 = Pattern.compile("[0-9]");
        Pattern pattern4 = Pattern.compile("[^A-Za-z0-9]");

        for (int i = 0; i < word.length(); i++) {
            Matcher matcher1 = pattern1.matcher(word.substring(i,i+1));
            Matcher matcher2 = pattern2.matcher(word.substring(i,i+1));
            Matcher matcher3 = pattern3.matcher(word.substring(i,i+1));
            Matcher matcher4 = pattern4.matcher(word.substring(i,i+1));
            if(matcher1.find()){
                largeLetterCount++;
            }
            if(matcher2.find()){
                smallLetterCount++;
            }
            if (matcher3.find()){
                numberCount++;
            }
            if (matcher4.find()){
                specialMarkCount++;
            }
        }
        System.out.println("large letter counter: " + largeLetterCount);
        System.out.println("small letter counter: " + smallLetterCount);
        System.out.println("numbers counter: " + numberCount);
        System.out.println("special mark counter: " + specialMarkCount);

        int [] solve = new int[]{largeLetterCount,smallLetterCount,numberCount,specialMarkCount};
        System.out.println(Arrays.toString(solve));

    }
}
