package Ch09;

import java.util.Scanner;

public class Ch09_11 {
    public static void main(String[] args){
        double a , b , c , d , e , f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        System.out.print("Enter d: ");
        d = input.nextDouble();
        System.out.print("Enter e: ");
        e = input.nextDouble();
        System.out.print("Enter f: ");
        f = input.nextDouble();

        //
        LinearEquation l = new LinearEquation(a,b,c,d,e,f);
        if (l.isSolvable()){
            System.out.println("x equal " + l.getX());
            System.out.println("y equal " + l.getY());
        }else {
            System.out.println("The equation has no solution");
        }
    }
}

class LinearEquation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable(){
        if (a * d - b * c != 0)
            return true;
        else
            return false;
    }

    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}
