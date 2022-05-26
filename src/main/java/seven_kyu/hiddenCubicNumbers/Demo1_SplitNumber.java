package seven_kyu.hiddenCubicNumbers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1_SplitNumber {
    public static void main(String[] args) {

        int m = 153;
        int n = 148;

//        String mStr = String.valueOf(m);
//
//        for (int i = 0; i < mStr.length(); i++) {
//            System.out.println(mStr.charAt(i));
//        }

//        System.out.println("\nReverse order: ");
//
//        while (m>0){
//            System.out.println(m%10);
//            m = m/10;
//        }

//        LinkedList<Integer> stack = new LinkedList<Integer>();
//        while (m > 0) {
//            stack.push( m % 10 );
//            m = m / 10;
//        }
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }


        System.out.println(isCubic(m));
        System.out.println(isCubic(n));

    }

    public static boolean isCubic(int m){
        String[] sNums = Integer.toString(m).split("");
        int x = Integer.parseInt(sNums[0]);
        int y = Integer.parseInt(sNums[1]);
        int z = Integer.parseInt(sNums[2]);
        return (m == (int) ((int) Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)));
    }

}
