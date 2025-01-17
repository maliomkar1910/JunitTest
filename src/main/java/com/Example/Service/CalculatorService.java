package com.Example.Service;

public class CalculatorService {

     public static  int add(int a, int b){
         return a+b;
     }
    public static  int sub(int a, int b){
        return a-b;
    }
    public static  int mul(int a, int b){
        return a*b;
    }
    public static  int div(int a, int b){
        return a/b;
    }

    public static int sumOfAllTest(int... numbers) {
        int sum = 0;
        for (int i:numbers){
            sum +=i;
        }
        return sum;
    }

    public static String printString(){
         return "Omkar";
    }


    public void print(){
        System.out.println("Hello");
    }

}
