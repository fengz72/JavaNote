package Ch04;

public class Ch04_08 {
    public static void main(String[] args){
        int number = (int) (Math.random() * 128);
        char asc = (char) number;
        System.out.println("The character for ASCII code " + number + " is " + asc);
    }
}
