package seven_kyu.areaOfPolygonInsideCircle;

/*
It should calculate the area of a regular polygon of numberOfSides,
number-of-sides, or number_of_sides sides inside a circle of radius circleRadius,
circle-radius, or circle_radius which passes through all the vertices of the polygon
(such circle is called circumscribed circle or circumcircle).
The answer should be a number rounded to 3 decimal places.

Input :: Output Examples
areaOfPolygonInsideCircle(3, 3) // returns 11.691

areaOfPolygonInsideCircle(5.8, 7) // returns 92.053

areaOfPolygonInsideCircle(4, 5) // returns 38.042
 */

public class AreaOfPolygonInsideCircle {
    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
     return Math.round((0.5 * Math.pow(circleRadius,2) * numberOfSides * Math.sin(Math.toRadians(360.0/numberOfSides)))*1000.0)/1000.0;
    }

    public static void main(String[] args) {

        System.out.println(areaOfPolygonInsideCircle(12, 14));
        System.out.println(areaOfPolygonInsideCircle(14, 22));
        System.out.println(areaOfPolygonInsideCircle(20, 19));
    }

    /*My comment:

        I considered this code working well.
        There was some bug (problem) in making the result round to three decimal places (in my opinion)

        My solution is not passing CodeWar random test example:
        Log
            100 Random Tests
            Random test #2: radius = 20 sides = 19
            expected:<1233.858> but was:<1174.265>

        Below mentioned part of code did a job!
        Math.sin(Math.toRadians(360.0/numberOfSides) instead of just 360 which caused above mentioned error.

        Kata finally solved ;)

    */
}
