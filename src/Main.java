public class Main {
    private static User user;

    public static void main(String[] args) {
        User avatar1 = getUser();
        avatar1.printUserInfo();

        User avatar2 = getUser();
        avatar2.setName("Linda");
        avatar2.setAge(28);
        avatar2.printUserInfo();

    }
    public static User getUser() {
        if(user == null) {
            user = new User();
        }
        return user;
    }
}