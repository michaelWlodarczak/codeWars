package seven_kyu.fibonacci;

import java.util.Scanner;

/*
Create function fib that returns n'th element of Fibonacci sequence (classic programming task).
 */
public class Fibonacci {
    public static long fib (int n){
        long x = 1;
        long y = 1;
        for (int i = 3; i <= n ; i++) {
            long z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
    /*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę
Fibonacciego o wskazanym indeksie. Przykładowo, jeśli użytkownik poda liczbę 5, Twój
program powinien wypisać piątą liczbę Fibonacciego. Kolejne liczby Fibonacciego
powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego. Przykładowo,
kilka pierwszych liczb Fibonacciego wynosi kolejno:  1,1,2,3,5,8,13,21,
1,1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21,13+21=34,
     */
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scanner.nextInt();
//        long x = 1;
//        long y = 1;
//        for (int i = 3; i <= n; i++) {
//            long z = x + y;
//            x = y;
//            y = z;
//        }
//        System.out.println(n + "-ty numer Fibonnaciego to: " + y);

        System.out.println(fib(5));
        System.out.println(fib(1));
        System.out.println(fib(14));
        System.out.println(fib(100));


    }
}
