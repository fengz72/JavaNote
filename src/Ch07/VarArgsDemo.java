package Ch07;

public class VarArgsDemo {
    public static void main(String[] args){
        printMax(34,3,2,1,56.12,47,47.3);
        printMax(new double[]{1,2,3});

    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > result)
                result = numbers[i];
        }

        System.out.println("The Max Value is " + result);
    }

}
