package Ch05;

public class Review5_7_1 {
    public static void main(String[] args){
        int sum1 = 0,sum2 = 0;
        int a = 0;
        int b = 1;
        a = b++;
        System.out.println(a + "" + b);
        for (int i = 0;i < 10;++i){
            sum1 += i;
        }
        for (int i = 0;i < 10;i++){
            sum2 += i;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
