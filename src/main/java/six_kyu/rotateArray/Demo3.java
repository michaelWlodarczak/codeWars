package six_kyu.rotateArray;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

        int[]data = {1,2,3,4,5};
        int n = 0;
        int[]result = new int[data.length];

        if(n>0){
            for(int i = 0; i < data.length; i++){
                result[(i+n) % data.length ] = data[i];
            }
            System.out.println(Arrays.toString(result));
        }else if (n<0){
            int m = Math.abs(n);
            for(int i = 0; i < data.length; i++){
                result[(i+(data.length-m)) % data.length ] = data[i];
            }
            System.out.println(Arrays.toString(result));
        }else {
            System.out.println(Arrays.toString(data));
        }
    }
}
