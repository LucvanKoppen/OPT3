public class User {
    private static User instance;
    private String name;

    private User() {
        // Private constructor to prevent instantiation from other classes
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}