package six_kyu.equalSidesOfAnArray;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

//        int[] arr = {1, 100, 50, -51, 1, 1};
//        int[]arr = {20,10,-80,10,10,15,35};
        int[]arr = {1,2,3,4,3,2,1};
        int n = arr.length;
        int[] otherSide = new int[n];
        int k = n;
        int sumArr = 0;
        int indexArr = 0;
        int sumOtherSide = 0;
        int indexOtherSide = 0;


        for (int i = 0; i < n; i++) {
            otherSide[k - 1] = arr[i];
            k = k - 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(otherSide));
        System.out.println("\norginal array: ");

        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
            indexArr = i;
            System.out.println("index:" + indexArr + " value: " + arr[i] + " sum: " + sumArr);
        }
        System.out.println("\nreversed array: ");
        for (int i = 0; i < otherSide.length; i++) {
            sumOtherSide += otherSide[i];
            indexOtherSide = i;
            System.out.println("index: " + indexOtherSide + " value: " + otherSide[i] + " sum: " + sumOtherSide);
        }

    }
}
