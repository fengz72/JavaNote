package Java_1.Ch07;

public class BinarySearch {
    //二分法查找，要求数组元素从小到大排列
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if (array[mid] < key)
                low = mid + 1;
            else if (array[mid] == key)
                return mid;
            else
                high = mid - 1;
        }
        return - low - 1;
    }
    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{2,4,7,10,11,45,50,59,60,66,69,70,79},12));
    }
}
