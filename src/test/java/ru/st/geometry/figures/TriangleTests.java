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
}