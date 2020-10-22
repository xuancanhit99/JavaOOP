package ru.mirea.canh.test;

class AgeException extends Exception {

    public AgeException(String message) {
        super(message);
    }

}
class TooYoungException extends AgeException {

    public TooYoungException(String message) {
        super(message);
    }

}
class TooOldException extends AgeException {

    public TooOldException(String message) {
        super(message);
    }

}
class AgeUtils {

    // Phương thức này làm nhiệm vụ kiểm tra tuổi.
    // Nếu tuổi nhỏ hơn 18 nó sẽ ném ra ngoại lệ TooYoungException
    // Nếu tuổi lớn hơn 40 nó sẽ ném ra ngoại lệ TooOldException
    public static void checkAge(int age) throws TooYoungException, TooOldException {
        if (age < 18) {
            // Nếu tuổi nhỏ hơn 18, một ngoại lệ sẽ được ném ra
            // Phương thức này sẽ kết thúc tại đây.
            throw new TooYoungException("Age " + age + " too young");
        } else if (age > 40) {
            // Nếu tuổi lớn hơn 40, ngoại lệ sẽ được ném ra.
            // Method này kết thúc tại đây.
            throw new TooOldException("Age " + age + " too old");
        }
        // Nếu tuổi nằm trong khoảng 18-40.
        // Đoạn code này sẽ được chạy.
        System.out.println("Age " + age + " OK!");
    }
}


class Person {

    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class GenderException extends Exception {

    public GenderException(String message)  {
        super(message);
    }
}

class ValidateException extends Exception {

    // Gói (wrap) Exception trong một Exception khác
    public ValidateException(Exception e)  {
        super(e);
    }

}


class ValidateUtils {

    // Phương thức kiểm tra 1 ứng viên.
    public static void checkPerson(Person person) throws ValidateException {
        try {

            // Kiểm tra tuổi.
            // Hợp lệ là trong khoảng 18-40
            // Method này có thể ném ra TooOldException,TooYoungException.
            AgeUtils.checkAge(person.getAge());

        } catch (Exception e) {

            // Nếu không hợp lệ
            // Gói ngoại lệ này bởi ValidateException, và ném ra (throw).
            throw new ValidateException(e);

        }

        // Nếu người này là Nữ, nghĩa là không hợp lệ.
        if (person.getGender().equals(Person.FEMALE)) {

            GenderException e = new GenderException("Do not accept women");
            throw new ValidateException(e);

        }
    }

}
class WrapperExceptionDemo {

    public static void main(String[] args) {

        // Một ứng viên.
        Person person = new Person("Marry", Person.FEMALE, 100);

        try {

            // Ngoại lệ có thể xẩy ra tại đây.
            ValidateUtils.checkPerson(person);

        } catch (ValidateException wrap) {

            // Lấy ra nguyên nhân thực sự.
            // Mà có thể là TooYoungException, TooOldException, GenderException.
            Exception cause = (Exception) wrap.getCause();

            if (cause != null) {
                System.out.println("Not pass, cause: " + cause.getMessage());
            } else {
                System.out.println(wrap.getMessage());
            }

        }
    }

}