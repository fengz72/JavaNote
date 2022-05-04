package Ch13;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{

    public ComparableRectangle(double width, double height){
        super(width, height);
    }
    @Override
    public int compareTo(ComparableRectangle o) {
//        if (getArea() > o.getArea())
//            return 1;
//        else if (getArea() < o.getArea())
//            return -1;
//        else
//            return 0;
        return ((Double)getArea()).compareTo(o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        return getArea() == ((Rectangle)obj).getArea();
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
