package six_kyu.rotateArray;

import java.util.Arrays;
import java.util.Collections;

/*
Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.

If n is greater than 0 it should rotate the array to the right.
If n is less than 0 it should rotate the array to the left. If n is 0,
then it should return the array unchanged.

Example:
with array [1, 2, 3, 4, 5]

n = 1      =>    [5, 1, 2, 3, 4]
n = 2      =>    [4, 5, 1, 2, 3]
n = 3      =>    [3, 4, 5, 1, 2]
n = 4      =>    [2, 3, 4, 5, 1]
n = 5      =>    [1, 2, 3, 4, 5]
n = 0      =>    [1, 2, 3, 4, 5]
n = -1     =>    [2, 3, 4, 5, 1]
n = -2     =>    [3, 4, 5, 1, 2]
n = -3     =>    [4, 5, 1, 2, 3]
n = -4     =>    [5, 1, 2, 3, 4]
n = -5     =>    [1, 2, 3, 4, 5]

The rotation shouldn't be limited by the indices available in the array.
Meaning that if we exceed the indices of the array it keeps rotating.

Example:

with array [1, 2, 3, 4, 5]

n = 7        =>    [4, 5, 1, 2, 3]
n = 11       =>    [5, 1, 2, 3, 4]
n = 12478    =>    [3, 4, 5, 1, 2]
 */

public class RotateArray {

    //OTHER SOLUTION

//    public Object[] rotate(Object[] data, int n) {
//        Collections.rotate(Arrays.asList(data), n);
//        return data;
//    }

    public Object[] rotate(Object[] data, int n) {
        Object[] result = new Object[data.length];

        if (n > 0) {
            for (int i = 0; i < data.length; i++) {
                result[(i + n) % data.length] = data[i];
            }
            return result;
        } else if (n < 0) {
            int m = Math.abs(n);
            for (int i = 0; i < m; i++) {
                int j;
                Object first;
                first = data[0];
                for (j = 0; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[j] = first;
            }
            return data;
        } else {
            return data;
        }


    }
}

