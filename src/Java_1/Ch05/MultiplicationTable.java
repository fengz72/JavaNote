package Ch05;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.print("     ");
        for (int i = 1; i < 10; i++)
            System.out.printf("%5d", i);
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println();
            System.out.print(i + " |  ");
            for (int j = 1; j < 10; j++)
                System.out.printf("%5d", (i * j));
        }
    }
}
