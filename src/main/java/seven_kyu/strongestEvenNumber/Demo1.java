package seven_kyu.strongestEvenNumber;

public class Demo1 {
    public static void main(String[] args) {
        int n = 12;
        int count1 = 0;

        while (n >= 2) {
            n = n / 2;
            System.out.print(n);
            count1++;
            if(n%2!=0)
                break;
        }
        System.out.println("\nCounter: " + count1);
        System.out.println();

        int m = 12;
        int count2 = 0;
        do {
            m=m/2;
            System.out.print(m);
            count2++;
            if(m%2!=0)
                break;
        }while (m>=2);
        System.out.println("\nCounter: " + count2);

    }

}
