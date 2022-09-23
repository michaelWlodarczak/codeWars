package six_kyu.tenMinWalk;// class created only for making random trials

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arrayN = {1, 0}; // 5
        int[] arrayS = {-1, 0}; //-1
        int[] arrayW = {0, -1}; // 3
        int[] arrayE = {0, 1}; // 1

        System.out.println("arrayN: " + Arrays.stream(arrayN).sum());
        System.out.println("arrayS: " + Arrays.stream(arrayS).sum());
        System.out.println("arrayW: " + Arrays.stream(arrayW).sum());
        System.out.println("arrayE: " + Arrays.stream(arrayE).sum());

        int[] arrays = {Arrays.stream(arrayN).sum(), Arrays.stream(arrayS).sum(), Arrays.stream(arrayW).sum(), Arrays.stream(arrayE).sum()};
        System.out.println("Total sum: " + Arrays.stream(arrays).sum() + "\n");

//        char[] walk = {'n', 's', 'w', 'e'};
//        char[] walk = {'n','s','n','s','n','s','n','s','n','s'};
//        char[] walk = {'w','e','w','e','w','e','w','e','w','e','w','e'};
//        char[] walk = {'w'};
        char[] walk = {'n','n','n','s','n','s','n','s','n','s'};

        int value = 0;
        int time = 0;

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                time++;
                int valueN = Arrays.stream(arrayN).sum();
                value += valueN;
            } else if (walk[i] == 's') {
                time++;
                int valueS = Arrays.stream(arrayS).sum();
                value += valueS;
            } else if (walk[i] == 'w') {
                time++;
                int valueW = Arrays.stream(arrayW).sum();
                value += valueW;
            } else if (walk[i] == 'e') {
                time++;
                int valueE = Arrays.stream(arrayE).sum();
                value += valueE;
            }

        }
        System.out.println("Value: " + value);
        System.out.println("Time: " + time);


//        int [] arr = {1,2,3};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            //sum = sum + arr[i];
//        }
//        System.out.println(sum);

        if (value == 0 && time == 10) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

}
