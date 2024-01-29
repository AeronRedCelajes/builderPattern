package builderPattern;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to E-Commerce Application Registration Form!");
        System.out.println("Please enter your user details to proceed.");
        System.out.println();

        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter your email (optional): ");
        String email = userInput.nextLine();

        System.out.print("Enter your address (optional): ");
        String address = userInput.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = userInput.nextLine();

        // Validate and obtain user input for age
        int age = 0;
        while (age <= 0) {
            System.out.print("Enter your age: ");
            try {
                age = userInput.nextInt();
                if (age < 0) {
                    System.out.println("Age must be a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
                userInput.nextLine();
            }
        }

        // Create a User object using UserBuilder
        User user = new User.UserBuilder(firstName, lastName, phone, age)
                .email(email)
                .address(address)
                .build();

        // Display the user information
        System.out.println();
        System.out.println("User Information Details: ");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone Number: " + user.getPhone());
        System.out.println("Age: " + user.getAge());
    }
}