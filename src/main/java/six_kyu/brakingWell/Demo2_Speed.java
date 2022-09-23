package six_kyu.brakingWell;

public class Demo2_Speed {

    //V^2 + 2*mu*g*V - 2*mu*g*d = 0

    // x = 2*mu*g
    // V = -x + (Math.sqrt(x^2 - 4*1*(-dx)) / 2
    // V = -x - (Math.sqrt(x^2 - 4*1*(-dx)) / 2


    public static void main(String[] args) {

        double mu = 0.7;
        final double g = 9.81;
        final double t = 1;

        double d = 153; // in meters

        double V = (-2*mu*g + Math.sqrt(Math.pow(2*mu*g,2)-4*(-d*2*mu*g)))/2;

        System.out.println("V= " + V*3.6);




    }
}
