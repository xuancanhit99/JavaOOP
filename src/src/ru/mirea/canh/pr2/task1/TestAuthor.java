package src.ru.mirea.canh.pr2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Jack Son", "jackson42@mail.ru", 'F');
        Author a2 = new Author("Xuan Canh", "xuancanhit99@gmail.com", 'M');
        Author a3 = new Author("Zed", "zedonlyme@my.smccd.edu", 'F');
        a1.setEmail("jackson123@mail.ru");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
