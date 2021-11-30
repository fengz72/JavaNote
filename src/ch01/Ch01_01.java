package ch01;

import java.util.Scanner;

public class Ch01_01 {
    public static void main(String args[]){
        double a, b, c, d, e, f;
        Scanner scanner=new Scanner((System.in));
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();
        d= scanner.nextDouble();
        e= scanner.nextDouble();
        f= scanner.nextDouble();
        double x=0,y=0;
        double delta=a*d-b*c;
        if(Math.abs(delta)>= 1E-10){
            x=(e*d-b*c)/delta;
            y=(a*f-e*c)/delta;
        }
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
