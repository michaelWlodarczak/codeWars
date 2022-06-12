package six_kyu.rotateArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo2_RotateLeft {
    public static void main(String[] args) {

        int[]data = {1,2,3,4,5};
        int m = -6;
        int n = Math.abs(m);
        int[]resultLeft = new int[data.length];


//        System.out.println("Orginal array:" + Arrays.toString(data));
//        for(int i = 0; i < data.length; i++){
//            resultLeft[(i+(data.length-n)) % data.length ] = data[i];
//        }
//
//        if(n>=2){
//            System.out.println("Array rotated " + n + " times to the left: " + Arrays.toString(resultLeft));
//        }else {
//            System.out.println("Array rotated " + n + " time to the left: " + Arrays.toString(resultLeft));
//        }


        Integer[] arr = {1,2,3,4,5};

        LinkedList<Integer> ns = new LinkedList<Integer>(Arrays.asList(arr));
        int rotate=3;
        if(rotate<0)
            rotate += arr.length;

        List<Integer> leftlist = ns.subList(0, rotate);
        List<Integer> rightlist = ns.subList(rotate, arr.length);

        LinkedList<Integer> result = new LinkedList<Integer>();
        result.addAll(rightlist);
        result.addAll(leftlist);

        System.out.println(result);





    }
}
