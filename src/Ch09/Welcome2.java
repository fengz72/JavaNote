package Ch09;

public class Welcome2 {
    public static void main(String[] args){
        Welcome2 w = new Welcome2();
        w.method1();
    }

    public void method1(){
        method2();
    }
    
    public static void method2(){
        System.out.println("   ");
    }


}
