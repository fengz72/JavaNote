package Ch11;

public class Review11_08_04 {
    public static void main(String[] args){
        Integer[] list1 = {12,24,55,1};
        Double[] list2 = {12.4,24.0,55.2,1.0};
        Object[] list3 = {1,2,3};
        printArray(list1);
        printArray(list2);
        printArray(list3);
    }

    public static void printArray(Object[] list){
        for (Object o: list)
            System.out.println(o + " ");
        System.out.println();
    }
}
