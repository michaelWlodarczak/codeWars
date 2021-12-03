package seven_kyu.arrayDiff;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("How to put new element into existing array: ");

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int x = 14;
        System.out.println("Initial array: " + Arrays.toString(arr));

        arr = addX(arr.length,arr,x);
        System.out.println("New array: " + Arrays.toString(arr));
    }

    private static int[] addX(int length, int[] arr, int x) {
        int[] newarr = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newarr[i] = arr[i];
            newarr[length]=x;
        }
        return newarr;
    }


}
