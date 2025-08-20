package Stack.stackArrayList;

import java.util.ArrayList;

public class ArrayListStack<E> implements StackEaaa<E>{
    private ArrayList<E> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(E element) {
        stack.addFirst(element);
    }

    @Override
    public E pop() {
        return stack.removeLast();
    }

    @Override
    public E peek() {
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    @Override
    public void clear() {
        stack = new ArrayList<>();
    }

    @Override
    public int size() {
        return stack.size();
    }

}
