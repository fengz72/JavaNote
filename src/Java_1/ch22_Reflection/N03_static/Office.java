package Java_1.ch22_Reflection.N03_Office;

public class Office {
    public static void main(String[] args) {
        if ("word".equals(args[0])){
            Word w = new Word();
            w.start();
        }

        if ("excel".equals(args[0])){
            Excel e = new Excel();
            e.start();
        }
    }
}
