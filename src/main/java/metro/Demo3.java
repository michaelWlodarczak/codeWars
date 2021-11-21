package metro;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        int passangersIn = 0;
        int passengersOut = 0;
        int remainingPassengers = 0;

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
