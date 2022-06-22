package six_kyu.brakingWell;

public class Demo1_Distance {

    public static double dist(double v, double mu) {    // suppose reaction time is 1
        // your code
        return 0;
    }

    /*
    d = v*v / 2*mu*g
    g = 9.81 m/s*s
     */

    public static void main(String[] args) {

        double v = 100.0;
        double v1 = v*1000/3600;
        System.out.println("v m/s: " + v1);
        final double g = 9.81;
        final double mu = 0.7;
        double e = Math.pow(v1,2);
        double w = 2*mu*g;
        System.out.println("e: " + e);
        System.out.println("w: " + w);
        double d = e/w;
        System.out.println("d: " + d);
    }
}
