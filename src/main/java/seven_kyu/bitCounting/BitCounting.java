package seven_kyu.bitCounting;

/*
Write a function that takes an integer as input,
and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

public class BitCounting {
    public static int countBits(int n){
        return Integer.bitCount(n);
    }

    //SAMPLE OTHER SOLUTIONS:

//    public static int countBits(int n) {
//        return Integer.toBinaryString(n).replaceAll("0","").length();
//    }


//    public static int countBits(int n){
//        String s = Integer.toBinaryString(n);
//        return  s.length() - s.replace("1", "").length();
//    }


//    public static int countBits(int n){
//        return (int) Integer.toBinaryString(n).chars()
//                .filter(c -> c == '1')
//                .count();
//    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        System.out.println(Integer.bitCount(num1));
        System.out.println(Integer.bitCount(num2));
        System.out.println(Integer.bitCount(num3));
        System.out.println(Integer.bitCount(num4));

        //int decimal to binary example:
        System.out.println(Integer.toBinaryString(num2));

        //String binary to decimal example:
        String ten = "1010";
        int num10 = Integer.parseInt(ten,2);
        System.out.println(num10);
    }
}
