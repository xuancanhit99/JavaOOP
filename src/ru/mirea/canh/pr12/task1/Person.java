package ru.mirea.canh.pr12.task1;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder fullName = new StringBuilder(lastName);
        if(firstName != null && !firstName.equals(""))
            fullName.append(" ").append(firstName);
        if(middleName != null && !middleName.equals(""))
            fullName.append(" ").append(middleName);
        return fullName.toString();
    }
}
