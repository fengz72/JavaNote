package Ch05;

public class Review5_12_1 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
