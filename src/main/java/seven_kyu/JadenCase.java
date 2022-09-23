package seven_kyu;

/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.
For simplicity, you'll have to capitalize each word,
check out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith,
but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
Note that the Java version expects a return value of null for an empty string or null.
 */
//7kyu
public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase==null || phrase.equals("")){
            return null;
        }
        char[]arr = phrase.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i==0 || arr[i-1]==' '){
                arr[i]=Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {

        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));

//        char a = 'a';
//        Character ah = Character.valueOf('a');
//        System.out.println(Character.toUpperCase('a'));


//        String phrase = "demokratyczna unia panstw astralnych";
//        char[] arr = phrase.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if(i==0 || arr[i-1]==' '){
//                arr[i]= Character.toUpperCase(arr[i]);
//            }
//        }
//        System.out.println(arr);


    }
}
