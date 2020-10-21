package com.imanage.test.stack;

import java.util.EmptyStackException;

public class Stack<E> extends StackUtil<E> {
    public Stack(int initialCapacity) {
        super(initialCapacity);
    }

    public E push(E item) {
        addElement(item);
        return item;
    }

    public synchronized E pop() {
        E obj;
        int len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }

    public synchronized E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
}
