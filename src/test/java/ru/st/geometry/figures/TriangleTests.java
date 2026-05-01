package ru.st.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {

        var t = new Triangle(13.0, 14.0, 15.0);
        Assertions.assertEquals(84.0, t.triangleArea());
    }

    @Test
    void canCalculateArea2() {

        var t = new Triangle(30, 34, 25);
        Assertions.assertEquals(363.47618560230325, t.triangleArea());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide(){
        try {
            new Triangle(13.0, -14.0, 15.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void cannotCreateTriangleWithNegativeSideSum(){
        try {
            new Triangle(1.0, 1.0, 10.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void testEquality(){
        var t1 = new Triangle(3.0,4.0,5.0);
        var t2 = new Triangle(5.0,4.0,3.0);
        Assertions.assertTrue(t1.equals(t2));
    }

    @Test
    void testNonEquality(){
        var t1 = new Triangle(10,10,10);
        var t2 = new Triangle(20,20,20);
        Assertions.assertNotEquals(t1,t2);
    }
}