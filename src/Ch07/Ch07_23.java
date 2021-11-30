package Ch07;

public class Ch07_23 {
    public static void main(String[] args){
        boolean[] l = new boolean[100];
        for (int i = 1; i <= 100; i++){
            for (int j = 1; j <= 100; j++){
                if (j % i == 0)
                    l[j - 1] = !l[j - 1];
            }
        }
        System.out.print("open: ");
        for (int i = 1; i <= 100; i++){
            if (l[i - 1])
                System.out.printf("%4d",i);
        }
    }
}
