package eight_kyu;/*
Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder,
you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

eight_kyu.Maskify.eight_kyu.Maskify("4556364607935616"); // should return "############5616"
eight_kyu.Maskify.eight_kyu.Maskify("64607935616");      // should return "#######5616"
eight_kyu.Maskify.eight_kyu.Maskify("1");                // should return "1"
eight_kyu.Maskify.eight_kyu.Maskify("");                 // should return ""

// "What was the name of your first pet?"
eight_kyu.Maskify.eight_kyu.Maskify("Skippy");                                   // should return "##ippy"
eight_kyu.Maskify.eight_kyu.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 */

public class Maskify {

    public static String maskify(String str) {
        if (str.length() >= 4) {
            String hash = "#";
            String beg = "";
            String end = str.substring(str.length() - 4, str.length());
            for (int i = 0; i < str.length() - 4; i++) {
                beg += hash;
            }
            return beg + end;
        } else if (str.length()<4) {
            return str;
        }else {
            throw new UnsupportedOperationException("Unimplemented");
        }
    }

    //Other solutions:

//    public static String maskify(String str) {
//        if (str.length() <= 4) return str;
//        String result = "";
//        for (int i = 0; i < str.length()-4; i++) {
//            result += "#";
//        }
//        return result + str.substring(str.length()-4);
//    }

    // :O ONE LINE SOLUTION
//    public static String maskify(String str) {
//        return str.replaceAll(".(?=.{4})", "#");
//    }

    public static void main(String[] args) {
        String str = "pathfinder";

//        System.out.println(str.length());
//        String end = str.substring(str.length() - 4, str.length());
//        System.out.println(end);
//
//        String hash = "#";
//        String beg = "";
//        for (int i = 0; i < str.length() - 4; i++) {
//            System.out.print(hash);
//        }
//        System.out.println();
//        System.out.println(str);
//        if (str.length() > 4) {
//            for (int i = 0; i < str.length() - 4; i++) {
//                beg = beg + hash;
//            }
//            System.out.println(beg + end);
//        }
        Maskify maskify = new Maskify();

        System.out.println(Maskify.maskify("steakhouse"));
        System.out.println(Maskify.maskify("open"));
        System.out.println(Maskify.maskify(""));
        System.out.println(Maskify.maskify("1"));


    }


}

