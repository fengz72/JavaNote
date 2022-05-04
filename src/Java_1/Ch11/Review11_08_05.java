package Ch11;

public class Review11_08_05 {
    public static void main(String[] args){
        new Person1().printPerson();
        new Student1().printPerson();
    }
}

class Student1 extends Person1{
    private String getInfo(){
        return "Student";
    }
}
class Person1{
    private String getInfo(){
        return "Person";
    }

    public void printPerson(){
        System.out.println(getInfo());
    }
}
