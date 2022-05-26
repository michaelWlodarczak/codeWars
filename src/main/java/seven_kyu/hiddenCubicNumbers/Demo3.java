package seven_kyu.hiddenCubicNumbers;

public class Demo3 {
    public static void main(String[] args) {

        String str = "nvjiwfid25d387vsnnie873";

        System.out.println(str);

        // extract digits only from strings
        String numberOnly = str.replaceAll("[^0-9]", "");

        // print the digits
        System.out.println(numberOnly);

        // Alternatively, You can also use \\D+ as a regular expression because it produces the same result:
//        String numberOnly1 = str.replaceAll("\\D+", "");
//        System.out.println(numberOnly1);

        // extract letters only from string
        String lettersOnly = str.replaceAll("[^A-Za-z]+","");
        System.out.println(lettersOnly);


    }
}
