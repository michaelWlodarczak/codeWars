package seven_kyu.areaOfPolygonInsideCircle;

public class Demo2 {
    public static void main(String[] args) {

        // S = 0,5 * circleRadius^2 * numberOfSides * sin(360/numberOfSides)
        // S = 0,5 * circleRadius^2 * cos(180/numberOfSides) * cos(45/numberOfSides) * cos(90/numberOfSides)
        // * numberOfSides * sin(45/numberOfSides)

        double circleRadius = 18;
        int numberOfSides = 22;

        double S = 0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360/numberOfSides));
        double S2 = 4 * Math.pow(circleRadius,2)
                * Math.cos(Math.toRadians(180/numberOfSides))
                * Math.cos(Math.toRadians(45/numberOfSides))
                * Math.cos(Math.toRadians(90/numberOfSides))
                * numberOfSides
                * Math.sin(Math.toRadians(45/numberOfSides));


        System.out.println(S);
        System.out.println(Math.round(S*1000.0)/1000.0);
        System.out.println(S2);
        System.out.println(Math.round(S2*1000.0)/1000.0);






    }
}
