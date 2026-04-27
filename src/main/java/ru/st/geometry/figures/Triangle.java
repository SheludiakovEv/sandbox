package ru.st.geometry.figures;

public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double s1, double s2, double s3) {
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
    }

    public static void printTriangleArea(Triangle s){

        System.out.println("Найти площадь треугольника = " + s.triangleArea());
    }

    public double triangleArea() {
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
}