package ru.mirea.canh.pr12.task2;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, housing, flat;
    public Address(String stringToParse, boolean onePunctuationMark) {
        if(stringToParse == null) throw new NullPointerException();
        String s[];
        if(onePunctuationMark) {
            StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens())
                s[i++] = st.nextToken();
        }
        else {
            s = stringToParse.split(",");
        }
        if(s.length < 7) throw new IllegalArgumentException("The given data is not enough.");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Страна: " + country + ",\nРегион: " + region + ",\nГород: " + city + ",\nУлица: " + street + ",\nНомер дома: "
                + house + ",\nКорпус: " + housing + ",\nКвартира: " + flat;
    }

}
