package com.company;

import java.util.Scanner;

public class EulerMethod {
    public static double f(double x,double y){
        return -x*y;
    }

    public static void main(String[] args) {
        double a,b,x,y,t,k,h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Xo = ");
        a=scanner.nextDouble();
        System.out.print("Enter value of Yo = ");
        b=scanner.nextDouble();
        System.out.print("Enter value of Interval = ");
        h=scanner.nextDouble();
        System.out.print("Enter value of Limit = ");
        t=scanner.nextDouble();

        x=a;
        y=b;
        while (x<t){
            k=h*f(x,y);
            y=y+k;
            x=x+h;
            System.out.println("x = "+x+"               "+"y = "+y);
        }
    }
}
