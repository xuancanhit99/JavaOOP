package ru.mirea.canh.pr16;

public final class Drink implements Item {
    private final int price;
    private final String name;
    private final String describe;

    public Drink(String name, String describe) {
        this.name = name;
        this.describe = describe;
        this.price = 0;
    }

    public Drink(int price, String name, String describe) {
        String message = "";
        if(price < 0)
            message += "Стоимость напитка не может быть меньше 0";
        if(name.equals("")) {
            if(message.length() > 0)
                message += ", ";
            message += "Название напитка не может быть пустым";
        }
        if(message.length() > 0)
            throw new IllegalArgumentException(message);
        this.price = price;
        this.name = name;
        this.describe = describe;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return "Drink : Price: " + price +
                " | Name: " + name +
                " | Describe: " + describe;
    }
}
