package Ch10;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public boolean empty(){
//        if (size == 0)
//            return true;
//        else
//            return false;
        return size == 0;
    }

    public int peek(){
        return elements[size - 1];
    }

    public void push(int value){
//        elements[size] = value;
//        size++;
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop(){
//        int temp = elements[size - 1];
//        elements[size - 1] = 0;
//        return temp;
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
