package eight_kyu.metro;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 0};
        int[] arr2 = {3, 5};
        int[] arr3 = {2, 5};
        int[] arr4 = {9, 6};
        int[] arr5 = {8, 5};
        int[] arr6 = {7, 13};

//        System.out.println(Arrays.toString(arr1)); //"drukowanie" tablicy

        int passangersIn = 0;
        int passengersOut = 0;
        int remainingPassengers = 0;

        ArrayList<int[]> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        list.add(arr6);

        for (int i = 0; i < list.size(); i++) {
            passangersIn += list.get(i)[0];
            passengersOut += list.get(i)[1];
        }
        remainingPassengers = passangersIn - passengersOut;
        System.out.println("Total passengers in :" + passangersIn);
        System.out.println("Total passengers out :" + passengersOut);
        System.out.println(("Passengers remaining on the bus at the last stop: " + remainingPassengers));

    }
}


