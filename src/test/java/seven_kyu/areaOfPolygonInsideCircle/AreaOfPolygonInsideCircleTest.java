package seven_kyu.areaOfPolygonInsideCircle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void test4() {
        assertEquals(437.355, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(12, 14), 1e-4);
    }

    @Test
    public void test5() {
        assertEquals(607.415, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(14, 22), 1e-4);
    }

    @Test
    public void test6() {
        assertEquals(1233.858, AreaOfPolygonInsideCircle.areaOfPolygonInsideCircle(20, 19), 1e-4);
    }



}