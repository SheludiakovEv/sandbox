package ru.st.geometry.figures;

import java.util.Objects;

public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        // Сначала проверяем значения
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalArgumentException("Сторона не может быть отрицательной");
        }
        if (side1 + side2 < side3 || side1 + side3 < side2 || side3 + side2 < side1) {
            throw new IllegalArgumentException("Сумма сторон не может быть отрицательной");
        }

        // Затем присваиваем
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void printTriangleArea(Triangle s){

        System.out.println("Найти площадь треугольника = " + s.triangleArea());
    }

    public double triangleArea() {
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(this.side1, triangle.side1) == 0 && Double.compare(this.side2, triangle.side2) == 0 && Double.compare(this.side3, triangle.side3) == 0
                || Double.compare(this.side1, triangle.side2) == 0 && Double.compare(this.side2, triangle.side3) == 0 && Double.compare(this.side3, triangle.side1) == 0
                || Double.compare(this.side1, triangle.side3) == 0 && Double.compare(this.side2, triangle.side1) == 0 && Double.compare(this.side3, triangle.side2) == 0
                || Double.compare(this.side1, triangle.side1) == 0 && Double.compare(this.side2, triangle.side3) == 0 && Double.compare(this.side3, triangle.side2) == 0
                || Double.compare(this.side1, triangle.side2) == 0 && Double.compare(this.side2, triangle.side1) == 0 && Double.compare(this.side3, triangle.side3) == 0
                || Double.compare(this.side1, triangle.side3) == 0 && Double.compare(this.side2, triangle.side2) == 0 && Double.compare(this.side3, triangle.side1) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }
}