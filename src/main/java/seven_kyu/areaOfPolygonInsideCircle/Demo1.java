package seven_kyu.areaOfPolygonInsideCircle;

public class Demo1 {
    public static void main(String[] args) {

        // S = 0,5 * circleRadius^2 * numberOfSides * sin(360/numberOfSides)

        double circleRadius = 5.8;
        int numberOfSides = 7;

        double S = 0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360/numberOfSides));

        double a = 0.5 * Math.pow(circleRadius, 2) * numberOfSides;

        double b = Math.round(Math.sin(Math.toRadians(360/numberOfSides)))*1000.0/1000.0;

        System.out.println("NOT round a: " + a);
        System.out.println("round a: " + (Math.round(a)*1000.0)/1000.0);
        System.out.println("NOT round b: " + b);
        System.out.println("round b: " + (Math.round(b)*1000.0)/1000.0);
        System.out.println(a * b);
        System.out.println(((Math.round(a) * 1000.0) / 1000.0) * ((Math.round(b) * 1000.0) / 1000.0));
        System.out.println("S:" + S);
        System.out.println("Round S: " + (Math.round(S)*1000.0)/1000.0);

//        System.out.println("360/" + numberOfSides + " = " + 360 / numberOfSides);
//        System.out.println(Math.sin(Math.toRadians(25)));


//        double d = 120;
//        // converting values to radians
//        double e = Math.toRadians(d);
//        System.out.println(Math.sin(e));
//        System.out.format("%.3f%n",S);

//        double input = 1205.6358;
//        System.out.println("salary : " + input);
//        double salary = Math.round(input * 1000.0) / 1000.0;
//        System.out.println("salary : " + salary);

        System.out.println("S: " + Math.round((0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360/numberOfSides)))*1000.0)/1000.0);
    }


}
