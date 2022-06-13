package six_kyu.rotateArray;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

        Object[]data = {1,2,3,4,5};
        int n = -2;
        Object[]result = new Object[data.length];

        if(n>0){
            for(int i = 0; i < data.length; i++){
                result[(i+n) % data.length ] = data[i];
            }
            System.out.println(Arrays.toString(result));
        }else if (n<0){
            int m = Math.abs(n);
            for(int i = 0; i < m; i++){
                int j;
                Object first;
                first = data[0];
                for(j = 0; j < data.length-1; j++){
                    data[j] = data[j+1];
                }
                data[j] = first;
            }
            System.out.println(Arrays.toString(data));
        }else {
            System.out.println(Arrays.toString(data));
        }
    }
}
