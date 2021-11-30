package Ch07;

public class SelectionSort {
    public static void selectionSort(double[] array){
        for (int j = 1; j < array.length ; j++) {

            for (int i = 0; i < array.length - j; i++) {

                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }

        }
    }

    public static void main(String[] args){
        double[] array = {1, 9 , 4.5 , 6.6 , 5.7 , -4.5 };
        selectionSort(array);

        for (double e:array)
            System.out.println(e);
    }
}
