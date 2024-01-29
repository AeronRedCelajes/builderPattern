## Problem Scenario
Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

```
public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}
```

However, you encounter challenges:
<ul>
<li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.</li>
<li>Optional fields: Not all customers provide complete information, but the constructor forces them to.</li>
<li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.</li>
</ul>
Implement solution using the Builder Pattern to address the issue.

## Class Diagram
![UML Builder Design Pattern](https://github.com/AeronRedCelajes/builderPattern/assets/142370807/6a97f1c7-b4a8-4517-b022-9eb7bde73ed5)
