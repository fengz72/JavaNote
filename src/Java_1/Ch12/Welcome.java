package Ch12;

public class Welcome {
    public static void main(String[] args){
        try {
            int i = 2 / 1;
            System.out.println("i " + i);

            int i1 = 2 / 0;//ArithmeticException
            System.out.println("i1 " + i1);

            int i2 = 2 / 2;
            System.out.println("i2 " + i2);
        }catch (IllegalArgumentException ex1){

        }catch (ArithmeticException ex2){
            throw ex2;
        }finally {
            System.out.println("it is finally.");
        }
        System.out.println("it is end");

    }

}
