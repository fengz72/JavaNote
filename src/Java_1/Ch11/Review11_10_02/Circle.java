package Ch11.Review11_10_02;

public class Circle {

    double radius;

    public boolean equals(Object circle){
        return this.radius == ((Circle)circle).radius;
    }

    public double getRadius() {
        return radius;
    }


}
