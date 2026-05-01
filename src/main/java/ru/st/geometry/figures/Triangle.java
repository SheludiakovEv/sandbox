package ru.st.geometry.figures;

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
}