package seven_kyu.strongestEvenNumber;

public class Demo2 {
    public static void main(String[] args) {
        int n = 8;
        int count1 = 0;

        while (n >= 2) {
            if(n%2!=0)
                break;
            n = n / 2;
            System.out.println(n);
            count1++;
        }
        System.out.println("\nCounter: " + count1);
    }
}
