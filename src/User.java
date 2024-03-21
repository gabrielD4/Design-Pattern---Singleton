public class User {

    private String name;

    private int age;

    public User() {
        this.name = "Gabriel";
        this.age = 31;
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
