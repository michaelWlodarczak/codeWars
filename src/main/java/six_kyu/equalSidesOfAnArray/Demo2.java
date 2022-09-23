package six_kyu.equalSidesOfAnArray;

import java.util.Arrays;

public class Demo2 {
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 100, 50, -51, 1, 1};
        int n = arr.length;

        reverse(arr, n);

        int[]otherSide = new int[n];
        int k = n;
        for (int i = 0; i < n; i++) {
            otherSide[k-1]=arr[i];
            k = k - 1;
        }
        System.out.println(Arrays.toString(otherSide));


    }
}
