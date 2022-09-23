package six_kyu.persist;

public class Demo1 {

    public static long getResult(long n){
        long x = 1;
        while(n!=0){
            x = x * (n%10);
            n = n/10;
        }
        return x;
    }

    public static void main(String[] args) {

        long n = 12;

        System.out.println(getResult(n));

    }
}
