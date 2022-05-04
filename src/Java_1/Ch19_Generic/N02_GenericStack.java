package Java_1.Ch19_Generic;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public E pop(){
        E elem = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return elem;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
