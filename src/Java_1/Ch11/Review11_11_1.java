package Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review11_11_1 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(0,5.0);
        list.add(0,4.0);
        System.out.println(list.size());
        list.remove(5.0);

        System.out.println(list.toString());

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dallas");
        list1.add("Dallas");
        list1.add("Houston");
        list1.add("Dallas");
        int size = list1.size();
        for (int i = 0; i < size; i++){
            list1.remove("Dallas");
        }
        System.out.println(list1.toString());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.remove(new Integer(1));
        System.out.println(list2.toString());

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(1.0);

        Integer[] array = {3,5,95,4,15,34,3,6,5};
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(array));
    }
}
