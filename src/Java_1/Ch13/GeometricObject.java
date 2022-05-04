package Ch13;

import java.util.Date;

public abstract class  GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dataCreated;


    protected GeometricObject() {
        this("black",false);
    }

    protected GeometricObject(String color, boolean filled){
        dataCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dataCreated=" + dataCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
