package Ch09;

public class Welcome {
    public static void main(String[] args){
        A a = new A("Welcome");
        a.print();
    }
}

class A{
    String s;

    A(String newS){
        s = newS;
    }

    public void print(){
        System.out.println(s);
    }
}