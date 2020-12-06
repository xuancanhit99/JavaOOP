package ru.mirea.canh.pr16;

public interface Order {
    boolean add(Item order);
    boolean remove(String orderName);
    int removeAll(String orderName);
    int getOrders();
    Integer[] getOrderPosition();
    int getPrice();
}
