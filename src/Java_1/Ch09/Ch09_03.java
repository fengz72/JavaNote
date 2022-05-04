package Ch09;

import java.util.Date;

public class Ch09_03 {
    public static void main(String[] args){
        Date date = new Date();
        for (int i = 0 ; i < 8; i++){
        date.setTime(10000 * ((int)Math.pow(10,i)));
            System.out.println(date.toString());
        }
    }
}
