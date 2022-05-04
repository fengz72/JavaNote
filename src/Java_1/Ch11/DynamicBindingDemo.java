package Ch11;

public class DynamicBindingDemo {
    public static void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
        Object o = new int[50];
        Object[] o1 = new Integer[50];
        System.out.println(o);

        Object[] o2 = new String[50];
        Object[] o3 = new Object[50];
    }

    public static void m(Object o){
        System.out.println(o.toString());
    }
}

class GraduateStudent extends Student{
    public GraduateStudent(){
        super();
    }
}
class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}
class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
