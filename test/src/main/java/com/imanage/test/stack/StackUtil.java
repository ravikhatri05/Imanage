package com.imanage.test.stack;


public class StackUtil<T> {

    protected Object[] elementData;

    protected int elementCount;

    public StackUtil(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        this.elementData = new Object[initialCapacity];
    }

    public synchronized void removeElementAt(int index) {
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    elementCount);
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int j = elementCount - index - 1;
        if (j > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, j);
        }
        elementCount--;
        elementData[elementCount] = null; /* to let gc do its work */
    }


    public synchronized void addElement(T obj) {
        if (elementCount >= elementData.length) {
            throw new ArrayIndexOutOfBoundsException("STACK SIZE BREACHED");
        }
        elementData[elementCount++] = obj;
    }

    public synchronized int size() {
        return elementCount;
    }

    public synchronized T elementAt(int index) {
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
        }
        return (T) elementData[index];
    }
}

