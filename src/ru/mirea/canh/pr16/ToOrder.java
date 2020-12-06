package ru.mirea.canh.pr16;

public class ToOrder extends RestaurantOrder {
    public ToOrder(String name, String describe) {
        super(name, describe);
    }

    public ToOrder(int price, String name, String describe) {
        super(price, name, describe);
    }
}
