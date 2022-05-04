package Java_1.Ch07;

public class Welcome1 {
    public static void main(String[] args) {
        //java.util.Arrays类包含的静态方法
        double[] array1 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        char[] array2 = {'a', 'A', '4', 'F', 'D', 'p'};
        java.util.Arrays.sort(array1);//升序
        for (double e : array1)
            System.out.printf("%4.1f", e);

        java.util.Arrays.sort(array2, 0, 3);//从0-2升序
        System.out.println();
        for (char e : array2)
            System.out.printf("%4c", e);

        double[] array3 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.parallelSort(array3);//parallelSort对多处理器更快
        java.util.Arrays.parallelSort(array3, 0, 4);
        System.out.println();
        for (double e : array3)
            System.out.printf("%4.1f", e);

        double[] array4 = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.binarySearch(array4, 2.9);//二分法查找，找到返回关键字，找不到返回（-所应在的位置）
        java.util.Arrays.binarySearch(array4, 2.0);

        int[] array5 = {1, 2, 3, 4, 5};
        int[] array6 = {1, 2, 3, 4, 5, 6};
        System.out.println();
        System.out.println(java.util.Arrays.equals(array5, array6));//比较，false (or true)

        int[] array7 = {1, 2, 3, 4, 5, 6};
        int[] array8 = {1, 2, 3, 4, 5, 6};
        java.util.Arrays.fill(array7, 7);
        java.util.Arrays.fill(array8, 0, 4, 7);//用7填0-3

        String s = java.util.Arrays.toString(array8);
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}
