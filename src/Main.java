public class Main {
    private static User user;

    public static void main(String[] args) {
        User avatar1 = User.getUser();
        avatar1.printUserInfo();

        User avatar2 = User.getUser();
        avatar2.setName("Linda");
        avatar2.setAge(28);
        avatar2.printUserInfo();
        avatar1.printUserInfo();
    }

}