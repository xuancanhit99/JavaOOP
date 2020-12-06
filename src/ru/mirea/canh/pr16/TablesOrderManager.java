package ru.mirea.canh.pr16;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager {
    private static final int size = 30; // Num of table
    private String[] table;
    private Map<String, Order> orderMap = new HashMap<String, Order>();
    public TablesOrderManager(RestaurantOrder  restaurantOrder) {
        table = new String[restaurantOrder.getOrders()];
        int i = 0;
        for(Item order : restaurantOrder.getDishes()) {
            table[i] = order.getDescribe() + ":  " + order.getName() + " " + order.getPrice() + "$";
            ++i;
        }
        for(Item order : restaurantOrder.getDrinks()) {
            table[i] = order.getDescribe() + ":  " + order.getName() + " " + order.getPrice() + "$";
            ++i;
        }
    }
    public boolean add(String address){
        return false;
    }

    public void get(String address){}

    public boolean remove(String address){
        return false;
    }

    public boolean setDescription(String address, Item item){
        return false;
    }

    public void printTable(){
        for (String s : table) {
            System.out.println(s);
        }
    }
}
