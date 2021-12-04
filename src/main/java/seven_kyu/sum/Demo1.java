package seven_kyu.sum;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Random Math.abs() values: ");
        System.out.println(Math.abs(1.0 / 0));
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Long.MIN_VALUE));
        System.out.println();

        System.out.println("Sum of digits inside array: ");
//        int[]arr = {1,2,3};
        int[]arr = {-3,-2,-1,0,1};
//        int[]arr = {-3,-2,-1};
//        int[]arr = {-1,0};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(sum + "\n");

        int a = -4;
        int b = -1;
        System.out.println("Which int is bigger: " + a + " or " + b + " ?");

        if (a > b || a == b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        int suma = 0;
        for (int i = a; i <= b ; i++) {
            suma = suma + i;
        }
        System.out.println("Sum of digits between " + a +" and " + b + " = " + suma);




    }
}
