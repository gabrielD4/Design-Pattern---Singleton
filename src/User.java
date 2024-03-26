public class User {

    private String name;

    private int age;

    private static User instance;

    private User() {
        this.name = "Gabriel";
        this.age = 31;
    }

    public static User getUser() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void printUserInfo() {
        System.out.println("User name: " + name + "\nUser age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
