package demoPackage;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Podaj liczbe " + i);
            temperature[i] = scanner.nextDouble();
        }



    }
}
