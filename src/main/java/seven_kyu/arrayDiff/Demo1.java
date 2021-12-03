package seven_kyu.arrayDiff;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2,4,6};

        int[]c= {0,0,0};
        int[]d= {0,0,0};
        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i]+b[i];
            d[i]=a[i]-b[i];
        }
        System.out.println("Array c = a + b: " + Arrays.toString(c));
        System.out.println("Array d = a - b: " + Arrays.toString(d));
        System.out.println();

        int[]e={1,2,3,4,5,6};
        int[]f={7};
        int length = e.length < f.length ? e.length : f.length; //TODO wytlumaczyc ta linijke kodu
        int[] result = new int[length];
        System.out.println(Arrays.toString(result));

        System.out.println("Array e: " + Arrays.toString(e));
        System.out.println("Array f: " + Arrays.toString(f));
        for (int i = 0; i < length; i++) {
            result[i]=e[i]+f[i];
        }
        System.out.println("Array result: " + Arrays.toString(result)); //Result: [8]

    }
}
