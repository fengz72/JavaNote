package Ch09;

public class _13_1 {
    private static int i = 1;
    private static int j = 1;

    public static void main(String[] args){
        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println(i + j);
        }
        k = i + j;
        System.out.println(k);
        System.out.println(j);
    }
}
