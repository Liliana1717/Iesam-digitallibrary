package org.com.iesam.digitallibrary.presentation;

import org.com.iesam.digitallibrary.domain.User;

public class UserPresentation {
    public static void main(String[]args){
    User user1 = new User("1", "Alice", "123 Main St", "alice@example.com");
    User user2 = new User("2", "Bob", "456 Elm St", "bob@example.com");


        System.out.println("User 1 ID: " + user1.getId());
        System.out.println("User 1 Name: " + user1.getName());
        System.out.println("User 1 Address: " + user1.getAddress());
        System.out.println("User 1 Email: " + user1.getEmail());

        System.out.println("User 2 ID: " + user2.getId());
        System.out.println("User 2 Name: " + user2.getName());
        System.out.println("User 2 Address: " + user2.getAddress());
        System.out.println("User 2 Email: " + user2.getEmail());

   
        user1.setName("Alice Smith");
        user1.setAddress("789 Oak St");

 
        System.out.println("Updated User 1 Name: " + user1.getName());
        System.out.println("Updated User 1 Address: " + user1.getAddress());
}

}
