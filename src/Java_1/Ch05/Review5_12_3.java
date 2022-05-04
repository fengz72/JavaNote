package Ch05;

public class Review5_12_3 {
    public static void main(String[] args){

        int sum = 0;
        int number = 0;
        boolean found = false;

        /****
        while(number < 20 && !found){
            number++;
            sum += number;
            if (sum >=100)
                found = true;
        }
        */
        while (number < 20){
            number++;
            if (number != 10 && number != 11)
                sum +=number;
        }
        System.out.println(number);
        System.out.println(sum);
    }
}
