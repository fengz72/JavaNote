package Ch04;

public class Ch04_25 {
    public static void main(String[] args){
        char first = (char)((int)(Math.random() * 27) + 65);
        char second = (char)((int)(Math.random() * 27) + 65);
        char third = (char)((int)(Math.random() * 27) + 65);
        char number4 = (char)((int)(Math.random() * 10) + 48);
        char number5 = (char)((int)(Math.random() * 10) + 48);
        char number6 = (char)((int)(Math.random() * 10) + 48);
        char number7 = (char)((int)(Math.random() * 10) + 48);
        /*int first = (int)(Math.random() * 27) + 65;
        int second = (int)(Math.random() * 27) + 65;
        int third = (int)(Math.random() * 27) + 65;
        int number4 = (int)(Math.random() * 10) + 48;
        int number5 = (int)(Math.random() * 10) + 48;
        int number6 = (int)(Math.random() * 10) + 48;
        int number7 = (int)(Math.random() * 10) + 48;*/
        System.out.println(first + "" + second + "" + third + "" + number4 + "" + number5 + "" + number6 + "" +number7 );
    }
}
