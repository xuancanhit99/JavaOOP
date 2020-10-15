package ru.mirea.canh.pr8.task1;

import java.util.Collection;

/**
 * Interface for WaitList
 * @author XuanCanh
 * @param <E> - type of data used in list
 * @version 1.0
 */
public interface IWaitList<E> {

    /**
     * Method adds a new item
     * @param element - new item
     */
    public void add(E element);

    /**
     * Method remove the last item in list
     * @return removed element
     */
    public E remove();

    /**
     * Method checks is WaitList contains item
     * @param element - item for search
     * @return result of finding
     */
    public boolean contains(E element);

    /**
     * Method checks is WaitList contains collection
     * @param c - collection for seach
     * @return result of finding
     */
    public boolean containsAll(Collection<E> c);

    /**
     * Method for check is WaitList is empty
     * @return result
     */
    public boolean isEmpty();
}
