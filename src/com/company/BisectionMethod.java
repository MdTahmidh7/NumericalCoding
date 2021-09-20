package com.company;
import java.util.Scanner;
public class BisectionMethod {
    public static float fun(float x){
        return x*x-4;
       // return x*x-3*x+2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Limit = ");
        float a =scanner.nextFloat();
        System.out.print("Enter 2nd Limit = ");
        float b= scanner.nextFloat();
        float c =(a+b)/2;
        if ((fun(a)*fun(b))<=0){
            while (Math.abs(fun(c))>0.0001){
                if(fun(c)*fun(a)>0){
                    a=c;
                }else{
                    b=c;
                }
                c=(a+b)/2;
            }
            System.out.println("The Root is = "+c);
        }else {
            System.out.println("The Limit are not valid");
        }
    }
}
