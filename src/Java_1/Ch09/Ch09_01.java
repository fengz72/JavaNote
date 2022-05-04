package Ch09;

public class Ch09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.setHeight(40);
        rectangle1.setWidth(4);
        System.out.println(rectangle1.getWidth() + " " + rectangle1.getHeight() + " " + rectangle1.getArea() + " " + rectangle1.getPerimeter());

        rectangle2.setHeight(35.9);
        rectangle2.setWidth(3.5);
        System.out.println(rectangle2.getWidth() + " " + rectangle2.getHeight() + " " + rectangle2.getArea() + " " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle() {
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}
