package com.example.userdetails;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for their details
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        // Print the user details
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

        scanner.close();

	}

}
