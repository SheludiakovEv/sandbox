package ru.st.geometry.figures;


import org.junit.jupiter.api.Test;

public class MatchTests {

    @Test
    public void testDivideByZero(){
        var a = 1;
        var b = 0;
        var x = a / b;
        System.out.println(x);
    }
}
