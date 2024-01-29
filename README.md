## Problem

<b>Problem Scenario</b>

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

<b>public User(String firstName, String lastName, String email,
<br>
           String address, String phone, int age) {
<br>
     // ...
<br>
}
</b>

However, you encounter challenges:
<ul>
<li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.</li>
<li>Optional fields: Not all customers provide complete information, but the constructor forces them to.</li>
<li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.</li>
Implement solution using the Builder Pattern to address the issue.
</ul>

## Class Diagram
