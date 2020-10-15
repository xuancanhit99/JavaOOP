package ru.mirea.canh.pr8.task1;

/**
 * UnfairWaitList class
 * @author XuanCanh
 * @param <E> - type of data used in list
 * @version 1.0
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /** Default constructor */
    public UnfairWaitList(){}

    /**
     * Method for removing the item from list
     * @param element - item for removing
     */
    public void remove(E element){
        content.remove(element);
    }

    /**
     * Method for moving item to the end
     * @param element element item for moving
     */
    public void moveToBack(E element){
        remove(element);
        super.add(element);
    }
}
