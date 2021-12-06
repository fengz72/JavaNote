package Ch10;

import java.util.Locale;

public class Review10_10_8 {

    private String text;

    public Review10_10_8(String s) {
        this.text = s;
    }
    public static void main(String[] args){
        Review10_10_8 r = new Review10_10_8("ABC");
        System.out.println(r.text.toLowerCase(Locale.ROOT));
    }
}
