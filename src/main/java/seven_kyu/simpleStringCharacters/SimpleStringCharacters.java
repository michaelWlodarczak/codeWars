package seven_kyu.simpleStringCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
In this Kata, you will be given a string and your task will be to return
a list of ints detailing the count of uppercase letters,
lowercase, numbers and special characters, as follows.

Solve("*'&ABCDabcde12345") = [4,5,5,3].
--the order is: uppercase letters, lowercase, numbers and special characters.
 */
public class SimpleStringCharacters {

    public static int [] Solve(String word) {
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

        int[] solve = {largeLetterCount, smallLetterCount, numberCount, specialMarkCount};
        return solve;
    }

    //OTHER SOLUTIONS:

//    static int[] Solve(String word) {
//        return new int[] {
//                word.replaceAll("[^A-Z]", "").length(),
//                word.replaceAll("[^a-z]", "").length(),
//                word.replaceAll("[^0-9]", "").length(),
//                word.replaceAll("[\\w]", "").length()
//        };
//    }

//    public static int[] Solve(String word) {
//        int upperCase = (int) word.chars().filter(value -> Character.isUpperCase(value)).count();
//        int lowerCase = (int) word.chars().filter(value -> Character.isLowerCase(value)).count();
//        int number = (int) word.chars().filter(value -> Character.isDigit(value)).count();
//        int specialChar = word.length() - (upperCase + lowerCase + number);
//        return new int[]{upperCase, lowerCase, number, specialChar};
//    }



}

