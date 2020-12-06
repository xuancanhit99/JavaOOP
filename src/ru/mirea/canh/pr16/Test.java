package ru.mirea.canh.pr16;

public class Test {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder() {
            @Override
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };

        restaurantOrder.add(new Drink("CocaCola", "drink"));
        restaurantOrder.add(new Drink(5,"Pepsi", "drink"));
        restaurantOrder.add(new Dish("Soup", "dish"));
        restaurantOrder.add(new Dish(6,"Burger", "dish"));
        TablesOrderManager tablesOrderManager = new TablesOrderManager(restaurantOrder);
        tablesOrderManager.printTable();
        System.out.println("Restaurant total price: " + restaurantOrder.priceTotal()+ "$\n");



        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Dish("Cake", "dish"));
        internetOrder.add(new Dish(1,"Pilaf", "dish"));
        internetOrder.add(new Drink(2,"Fanta", "drink"));
        internetOrder.add(new Drink(3,"Gorilla", "drink"));

        for(Item i : internetOrder.getOrdersArray()){
            System.out.println(i.getDescribe() + ":  " + i.getName() + " " + i.getPrice() + "$");
        }
        System.out.println("Internet total price: " + internetOrder.priceTotal() + "$");
    }
}
