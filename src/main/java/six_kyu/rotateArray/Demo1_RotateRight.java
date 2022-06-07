package six_kyu.rotateArray;

import java.util.Arrays;

public class Demo1_RotateRight {
    public static void main(String[] args) {

        int[]data = {1,2,3,4,5};
        int n = 1;
        int[]resultRight = new int[data.length];

        System.out.println("Orginal array:" + Arrays.toString(data));
        for(int i = 0; i < data.length; i++){
            resultRight[(i+n) % data.length ] = data[i];
        }
        if(n>=2){
            System.out.println("Array rotated " + n + " times to the right: " + Arrays.toString(resultRight));
        }else {
            System.out.println("Array rotated " + n + " time to the right: " + Arrays.toString(resultRight));
        }


    }
}
