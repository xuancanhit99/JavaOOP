package ru.mirea.canh.pr16;
import java.util.HashMap;
import java.util.Map;
public class InternetOrder implements Order{
    private static final int size = 30;
    public static Map<Integer,Item> orders = new HashMap<>();
    public InternetOrder() {}
    public InternetOrder(RestaurantOrder[] orders) {}

    @Override
    public boolean add(Item order) {
        if ((orders.size() <= size) && (orders.get(orders.size()) == null)) {
            orders.put(orders.size(), order);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String orderName) {
        for (Map.Entry entry : orders.entrySet())
            if (entry.getValue().toString().equals(orderName)) {
                orders.remove(entry.getKey(), entry.getValue());
                return true;
            }
            else return false;
        return false;
    }

    @Override
    public int removeAll(String orderName) {
        int count = orders.size();
        orders.values().remove(orderName);
        return count - orders.size();
    }

    @Override
    public int getOrders() {
        return orders.size();
    }

    @Override
    public Integer[] getOrderPosition() {
        return orders.keySet().toArray(new Integer[0]);
    }

    @Override
    public int getPrice() {
        return this.getPrice();
    }

    public Item[] getOrdersArray() {
        return orders.values().toArray(Item[]::new);
    }

    public int priceTotal(){
        int sum = 0;
        for(Item i : orders.values()) {
            sum += i.getPrice();
        }
        return sum;
    }
}
