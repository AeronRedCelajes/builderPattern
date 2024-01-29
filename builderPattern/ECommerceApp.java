package builderPattern;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to E-Commerce Application Registration Form!");
        System.out.println("Please enter your user details to proceed.");
        System.out.println();

        String firstName;
        do {
            System.out.print("Enter your first name: ");
            firstName = userInput.nextLine().trim();
            if (firstName.isEmpty())
                System.out.println("First name is required. Please enter your first name.\n");
        } while (firstName.isEmpty());

        String lastName;
        do {
            System.out.print("Enter your last name: ");
            lastName = userInput.nextLine().trim();
            if (lastName.isEmpty())
                System.out.println("Last name is required. Please enter your last name.\n");
        } while (lastName.isEmpty());

        System.out.print("Enter your email (optional): ");
        String email = userInput.nextLine();

        System.out.print("Enter your address (optional): ");
        String address = userInput.nextLine();

        String phone;
        do {
            System.out.print("Enter your phone number: ");
            phone = userInput.nextLine().trim();
            if (phone.isEmpty())
                System.out.println("Phone number is required. Please enter your phone number.\n");
        } while (phone.isEmpty());

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            String ageInput = userInput.nextLine().trim();
            if (ageInput.isEmpty())
                System.out.println("Age is required. Please enter your age.\n");
            else {
                try {
                    age = Integer.parseInt(ageInput);
                    if (age <= 0)
                        System.out.println("Age must be a positive number.\n");
                    else
                        validAge = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number for age.\n");
                }
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
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone Number: " + user.phone);
        System.out.println("Age: " + user.age);
    }
}