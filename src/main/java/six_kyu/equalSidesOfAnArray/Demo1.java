package six_kyu.equalSidesOfAnArray;

public class Demo1 {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,3,2,1};
        int[] arr = {1, 100, 50, -51, 1, 1};
//        int[] arr = {20,10,-80,10,10,15,35};
        int sumLeft = 0;
        int sumRight = 0;
        int indexLeft = 0;
        int indexRight = 0;

        System.out.println("array lenght: " + arr.length);
        System.out.println(arr.length / 2);

        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            indexLeft = i;
            System.out.println("Index left: " + indexLeft +
                    " ,element value: " + arr[i] + " ,sumLeft: " + sumLeft);
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            sumRight += arr[i];
            indexRight = i;
            System.out.println("Index right: " + indexRight +
                    " ,element value: " + arr[i] + " ,sumRight:" + sumRight);
        }




    }
}
