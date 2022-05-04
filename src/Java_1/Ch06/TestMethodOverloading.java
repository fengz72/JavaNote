package Ch06;

public class TestMethodOverloading {
    /**Main method*/
    public static void main(String[] args){
        
    }

    public static int max(int num1,int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1,double num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1,double num2,double num3){
        return max(num1,max(num2,num3));
    }
}
