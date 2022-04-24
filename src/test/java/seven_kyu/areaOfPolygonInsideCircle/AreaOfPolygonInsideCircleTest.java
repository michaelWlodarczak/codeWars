package seven_kyu.areaOfPolygonInsideCircle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class AreaOfPolygonInsideCircleTest{

    @Test
    public void test1() {
        assertEquals(11.691, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(3, 3), 1e-4);
    }

    @Test
    public void test2() {
        assertEquals(8, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(2, 4), 1e-4);
    }

    @Test
    public void test3() {
        assertEquals(14.86, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(2.5, 5), 1e-4);
    }

}