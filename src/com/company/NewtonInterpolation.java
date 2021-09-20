package com.company;

public class NewtonInterpolation {

    public static float f(float x){
        return (float) Math.log10(x);
    }

    public static float f1(float x0,float x1){
        return ((f(x1)-f(x0)/(x1-x0)));
    }

    public static float f2(float x0,float x1,float x2){
        return ((f1(x1,x2)-f1(x0,x1))/(x2-x0));
    }

    public static float interpolation(float x,float x0,float x1,float x2){
        float a0,a1,a2,result;
        a0=f(x0);
        a1=f1(x0,x1);
        a2=f2(x0,x1,x2);
        result = a0+a1*(x-x0)+a2*(x-x0)*(x-x1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(interpolation(2.5F,1,2,3));
    }
}
