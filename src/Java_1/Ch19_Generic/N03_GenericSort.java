package Java_1.Ch19_Generic;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3, 5};
        Double[] doubleArray = {3.4, 1.3, -22.1};
        Character[] charArray = {'a', 'J', 'r'};
        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        printList(intArray);
        printList(doubleArray);
        printList(charArray);
        printList(stringArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list){
        E min;
        int indexOfMin;
        //列表循环n-1次，每次执行找出最小的数，放到i处
        for (int i = 0; i < list.length - 1; i++){
            min = list[i];
            indexOfMin = i;


            for (int j = i + 1; j < list.length; j++){
                if (min.compareTo(list[j]) > 0){
                    min = list[j];
                    indexOfMin = j;
                }
            }

            list[indexOfMin] = list[i];
            list[i] = min;
        }
    }

    public static void printList(Object[] list){
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}
