package six_kyu.rotateArray;

import java.util.Arrays;

public class Demo2_RotateLeft {
    public static void main(String[] args) {

        int[]data = {1,2,3,4,5};
        int m = -1;
        int n = Math.abs(m);
        int[]resultLeft = new int[data.length];


        System.out.println("Orginal array:" + Arrays.toString(data));
        for(int i = 0; i < data.length; i++){
            resultLeft[(i+(data.length-n)) % data.length ] = data[i];
        }

        if(n>=2){
            System.out.println("Array rotated " + n + " times to the left: " + Arrays.toString(resultLeft));
        }else {
            System.out.println("Array rotated " + n + " time to the left: " + Arrays.toString(resultLeft));
        }





    }
}
