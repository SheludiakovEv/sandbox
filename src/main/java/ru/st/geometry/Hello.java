package ru.st.geometry;

import java.io.File;

public class Hello {

    public static void main(String[] args) {

        System.out.println(new File("").getAbsoluteFile());

            int a = 1;
            int b = 0;
            if(b == 0){
                System.out.println("Деление на ноль");
            } else {
                int x = divide(a, b);
                System.out.println(x);
                System.out.println("Вывод текста");
            }
    }

    private static int divide(int a, int b) {
        int x = a / b;
        return x;
    }
}
