package ru.mirea.canh.pr16;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RestaurantOrder extends Dish implements Order {
    private static final int size = 30;
    public static Map<Integer,Item> orders = new HashMap<>();

    public RestaurantOrder(){}
    public RestaurantOrder(String name, String describe) {
        super(name, describe);
    }

    public RestaurantOrder(int price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public boolean add(Item dish) {
        if ((orders.size() <= size) && (orders.get(orders.size()) == null)) {
            orders.put(orders.size(), dish);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String dishName) {
        for (Entry entry : orders.entrySet())
            if (entry.getValue().toString().equals(dishName)) {
                orders.remove(entry.getKey(), entry.getValue());
                return true;
            } else {
                return false;
            }
        return false;
    }

    @Override
    public int removeAll(String dishName) {
        int count = orders.size();
        orders.values().remove(dishName);
        return count - orders.size();
    }

    public int dishQuantity(){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getDescribe().equals("dish")){
                count++;
            }
        }
        return count;
    }

    public int dishQuantity(String dishName){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getName().equals(dishName)){
                count++;
            }
        }
        return count;
    }

    public int drinkQuantity(){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getDescribe().equals("drink")){
                count++;
            }
        }
        return count;
    }

    public int drinkQuantity(String drinkName){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getName().equals(drinkName)){
                count++;
            }
        }
        return count;
    }

    public Dish[] getDishes(){
        Dish[] dishes = new Dish[this.dishQuantity()];
        int j = 0;
        for(Item i : orders.values()) {
            if(i.getDescribe().equals("dish")){
                dishes[j] = new Dish(i.getPrice(), i.getName(), i.getDescribe());
                ++j;
            }
        }
        return dishes;
    }

    public Drink[] getDrinks(){
        Drink[] drinks = new Drink[this.dishQuantity()];
        int j = 0;
        for(Item i : orders.values()) {
            if(i.getDescribe().equals("drink")){
                drinks[j] = new Drink(i.getPrice(), i.getName(), i.getDescribe());
                ++j;
            }
        }
        return drinks;
    }

    public int priceTotal(){
        int sum = 0;
        for(Item i : orders.values()) {
            sum += i.getPrice();
        }
        return sum;
    }

    public String[] OrdersNames(){
        String[] temp = new String[orders.size()];
        int j = 0;
        for(Item i : orders.values()){
            temp[++j] = i.getName();
        }
        return temp;
    }

    @Override
    public int getOrders() {
        return orders.size();
    }

    @Override
    public Integer[] getOrderPosition() {
        return orders.keySet().toArray(new Integer[0]);
    }
}
