package builderPattern;

public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    // Constructor with UserBuilder as input
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    // Getters for the fields
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    // Static nested class for building User objects
    protected static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String email = "";
        private String address = "";
        private final String phone;
        private final int age;

        // Constructor with required parameters
        public UserBuilder(String firstName, String lastName, String phone, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
            this.age = age;
        }

        // Method to set optional email
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        // Method to set optional address
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        // Build method to create User object
        public User build() {
            return new User(this);
        }
    }
}