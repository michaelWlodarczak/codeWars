package seven_kyu.areaOfPolygonInsideCircle;

public class Demo1 {
    public static void main(String[] args) {

        // S = 0,5 * circleRadius^2 * numberOfSides * sin(360/numberOfSides)

        double circleRadius = 14;
        int numberOfSides = 14;

        double S = 0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360/numberOfSides));

        double a = (0.5 * Math.pow(circleRadius, 2) * numberOfSides);

        double b = Math.sin(Math.toRadians(360/numberOfSides));

        System.out.println(a);
        System.out.println(b);
        System.out.println(a * b);


//        double d = 120;
//        // converting values to radians
//        double e = Math.toRadians(d);
//        System.out.println(Math.sin(e));
//        System.out.format("%.3f%n",S);

//        double input = 1205.6358;
//        System.out.println("salary : " + input);
//        double salary = Math.round(input * 1000.0) / 1000.0;
//        System.out.println("salary : " + salary);

        System.out.println(Math.round((0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360/numberOfSides)))*1000.0)/1000.0);
    }


}
