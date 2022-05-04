package Java_1.Ch18;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] list, int key){
        return recursiveBinarySearch(list, key, 0, list.length - 1);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high){
        if (low > high)
            return -low - 1;

        int mid = (low + high) / 2;
        if (list[mid] > key)
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (list[mid] == key)
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}
