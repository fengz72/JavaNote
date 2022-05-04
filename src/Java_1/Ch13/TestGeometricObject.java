package Ch13;

public class TestGeometricObject {
    public static void main(String[] args){
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5,2);

        System.out.println("The Two objects have the same area? " + equalArea(geoObject1,geoObject2));
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        //return ((Circle)object1).getArea() == ((Rectangle)object2).getArea();
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
