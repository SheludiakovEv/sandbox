package ru.st.geometry;

import ru.st.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {

        Triangle.printTriangleArea(new Triangle(13,14,15));
        Triangle.printTriangleArea(new Triangle(23,24,25));
        Triangle.printTriangleArea(new Triangle(33,34,35));

    }
}