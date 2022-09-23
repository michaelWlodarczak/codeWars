package six_kyu.brakingWell;

public class Demo1_Distance {
    /*
    d = v*t + v*v / 2*mu*g
    g = 9.81 m/s*s
     */

    public static void main(String[] args) {

        double v = 144.0;
        double v1 = v*1000/3600;
        System.out.println("v m/s: " + v1);
        final double g = 9.81;
        final double mu = 0.3;
        final double t = 1;
        double e = Math.pow(v1,2);
        double w = 2*mu*g;
        System.out.println("e: " + e);
        System.out.println("w: " + w);
        double d_long = v1*t + e/w;
        System.out.println("d: " + d_long);
        double d = v1*t + (Math.pow(v1,2))/(2*mu*g);
        System.out.println(d);

    }
}
