package Ch07;

public class LinearSearch {
    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static int linearSearch(double[] array, double key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key)
                return i;
        }
        return -1;
    }
}
