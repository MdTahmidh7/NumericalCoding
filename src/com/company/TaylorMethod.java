package com.company;
public class TaylorMethod {
    public static float f1(float x,float y){
        return (x*x)+(y*y);
    }
    public static float f2(float x,float y){
        return (2*x)+(2*y*f1(x,y));
    }
    public static float f3(float x,float y){
        return 2+(2*y*f2(x,y))+(2*f1(x,y)*f1(x,y));
    }
    public static float taylor(float t,float x,float y){
        float result;
        result = f1(x,y)+f1(x,y)*(t-x)+((f2(x,y)*(t-x)*(t-x))/2)+((f3(x,y)*(t-x)*(t-x)*(t-x))/6);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(taylor(.25F,0,1));
    }
}
