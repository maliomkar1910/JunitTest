package com.Example.Service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

    @Test
    public  void addTest(){
        //actual Result
        int add = CalculatorService.add(12, 12);

        //Expected result
        int result = 24;

        Assert.assertEquals(result,add);
    }

    @Test
    public void sumOfAllTest(){
        int sum = CalculatorService.sumOfAllTest(2, 2, 2, 2, 2);

        int expected = 10;

        Assert.assertEquals(expected,sum);
    }

    @Test
    public void printStringTest(){
        String s = CalculatorService.printString();

        String Expected ="Omkar";

        Assert.assertEquals(Expected,s);

    }

}



