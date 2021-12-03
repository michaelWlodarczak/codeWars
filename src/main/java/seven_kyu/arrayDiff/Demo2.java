package seven_kyu.arrayDiff;

import java.util.Arrays;

/*
Arrays can be compared using following ways in Java

Using Arrays.equals(array1, array2) methods − This method iterates over each value of an array
and compare using equals method.

Using Arrays.deepEquals(array1, array2) methods − This method iterates over each value of an array
and deep compare using any overridden equals method.

Using == on array will not give the desired result and it will compare them as objects.
 */

public class Demo2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println("Arrays: a = {1,2,3} and b = {2}\n"
                + "== results: " + (a == b) + "\n"
                + "Arrays.equals() results: " + Arrays.equals(a,b) + "\n");

        Object[] objArrayA = {a};
        Object[] objArrayB = {b};

        System.out.println("Arrays: objArrayA = {a}, objArrayB = {b}\n"
                + "Arrays.equals() results: " + Arrays.equals(objArrayA,objArrayB)
        + "Arrays.deepEquals() results: " + Arrays.deepEquals(objArrayA,objArrayB));

        //

    }
}
