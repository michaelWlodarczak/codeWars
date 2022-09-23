package six_kyu.equalSidesOfAnArray;


import java.util.Arrays;

public class Demo4 {

    public static int findEvenIndex(int[] arr) {
        int left = 0;
        int right = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            right -= arr[i];
            if (left == right) return i;
            left += arr[i];
        }
        return -1;
    }


    public static void main(String[] args) {

//        int[] arr = {1, 100, 50, -51, 1, 1};
//        int[]arr = {20,10,-80,10,10,15,35};
        int[] arr = {1, 2, 3, 4, 3, 2, 1};

        System.out.println(findEvenIndex(arr));

        int left = 0;
        int right = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            right -= arr[i];
            if (left == right) System.out.println(i);
            left += arr[i];
        }
        System.out.println(-1);
    }
}

