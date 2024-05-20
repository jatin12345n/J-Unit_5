package com.example.springbootoctober2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathUtilsTest {
    // todo Exercise:1
    @Test
    void test() {

        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "the add method should add two numbers");
        System.out.println("Test is run successfully " + actual);

    }

    @Test
    void testSubtraction(){
        MathUtils mathUtils=new MathUtils();
        int expected = 2;
        int actual=mathUtils.subtraction(5,3);
        assertEquals(expected,actual,"the sub method should have two numbers");
        System.out.println("Test is run successfully " + actual);
    }

    @Test
   void testMulti(){
        MathUtils mathUtils=new MathUtils();
        int expected=2;
        int actual=mathUtils.multiply(2,1);
        assertEquals(expected,actual);
    }


    @Test
    void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"divide by zero should throw");

    }


    // todo Exercise:2
    @Test
    void testComputeCircleRadius() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "should return right circle area");
    }

}
