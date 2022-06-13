package six_kyu.rotateArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo2_RotateLeft {
    public static void main(String[] args) {

        int[]data = {1,2,3,4,5};
        int m = -2;
        int n = Math.abs(m);

        System.out.println("Orginal array:" + Arrays.toString(data));

        //Rotate the given array by n times toward left
        for(int i = 0; i < n; i++){
            int j, first;
            //Stores the first element of the array
            first = data[0];
            for(j = 0; j < data.length-1; j++){
                //Shift element of array by one
                data[j] = data[j+1];
            }
            //First element of array will be added to the end
            data[j] = first;
        }
        System.out.println();

        if(n>=2){
            System.out.println("Array rotated " + n + " times to the left: " + Arrays.toString(data));
        }else {
            System.out.println("Array rotated " + n + " time to the left: " + Arrays.toString(data));
        }








    }
}
