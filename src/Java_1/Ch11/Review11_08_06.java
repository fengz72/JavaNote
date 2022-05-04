package Ch11;

public class Review11_08_06 {
    public static void main(String[] args){
        A2 a2 = new A2(2);
    }
}
class A2 extends B2{
    public A2(int i){
        System.out.println("A2");
    }
}
class B2{
    public B2(){
        System.out.println("B1");
    }
}
