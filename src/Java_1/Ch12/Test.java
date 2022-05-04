package Ch12;

import Ch11.Circle;

public class Test {
    public static void main(String[] args){
        try {
            method();
            System.out.println("After the method all");
        }catch (RuntimeException ex){
            System.out.println("RuntimeException in main()");
        }catch (Exception ex){
            System.out.println("Exception in main()");
        }
    }

    static void method() throws Exception{
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }catch (RuntimeException ex1){
            System.out.println("RuntimeException in method()");
        }catch (Exception ex2){
            System.out.println("Exception in method()");
            throw ex2;
        }
    }
}
