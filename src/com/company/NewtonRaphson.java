package com.company;

public class NewtonRaphson {
    public static float f(float x){
        //return (x*x*x)-(x*x)+2;
        return (x*x)-(3*x)+2;
    }
    public static float derivf(float x){
        return (2*x)-3;
    }
    public static void newTonRaphson(float x){
        float h = (f(x)/derivf(x));
        while (Math.abs(h)>=0.001){
           // h = (f(x)/derivf(x));
            x=x-h;
            h = (f(x)/derivf(x));
        }
        System.out.print("The value of the root is : " + Math.round(x * 100.0) / 100.0);
    }


    public static void main(String[] args) {
        newTonRaphson(-30);
    }
}
