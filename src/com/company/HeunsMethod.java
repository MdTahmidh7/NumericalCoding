package com.company;
import java.util.Scanner;
public class HeunsMethod {
    public static float f(float x,float y){
        return -x*y;
    }

    public static void main(String[] args) {
        float a,b,x,y,t,h,k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of Xo = ");
        a=scanner.nextFloat();
        System.out.print("Enter value of Yo = ");
        b=scanner.nextFloat();
        System.out.print("Enter value of Interval = ");
        h=scanner.nextFloat();
        System.out.print("Enter value of Limit = ");
        t=scanner.nextFloat();

        x=a;
        y=b;
        while (x<t){
            k=(h/2)+(f(x,y)+f(x+h,y+(h*f(x,y))));
            y=y+k;
            x=x+h;
            System.out.println("x = "+x+"               "+"y = "+y);
        }
    }
}
