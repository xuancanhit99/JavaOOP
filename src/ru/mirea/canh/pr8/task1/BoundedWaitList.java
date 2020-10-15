package ru.mirea.canh.pr8.task1;

/**
 * WaitList class with bounds
 * @author XuanCanh
 * @param <E>
 * @version 1.0
 */
public class BoundedWaitList<E> extends WaitList<E> {

    /** Capacity of WaitList */
    private int capacity;

    /**
     * Constructor with list capacity
     * @param capacity - capacity of list
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }


    /**
     * Method returns capacity of list
     * @return capacity of WaitList
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method adds a new item to list
     * @param element - new element for list
     * @throws RuntimeException - Not enough capacity for adding new item
     * @see IWaitList#add
     */
    @Override
    public void add(E element) {
        if(content.size() < capacity) {
            super.add(element);
        }
        else
            throw new RuntimeException("Not enough capacity for adding new item");
    }

    /** @see Object#toString() */
    @Override
    public String toString() {
        return super.toString() + " Capacity = " + getCapacity();
    }
}
