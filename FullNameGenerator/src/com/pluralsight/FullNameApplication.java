package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        System.out.println("First Name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine().trim();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();
        fullname(firstName, middleName, lastName, suffix);
    }

    public static void fullname(String firstName, String middleName, String lastName, String suffix) {
        if (firstName.isEmpty()) {
            System.out.println("please enter first name");
        } else {
            System.out.println(firstName + " ");
        }
        if (!middleName.isEmpty()) {
            System.out.println(middleName + ". ");
        }
        if (lastName.isEmpty()) {
            System.out.println("must enter last name");
        } else {
            System.out.println(lastName);
        }
        if (!suffix.isEmpty()) {
            System.out.println(", " + suffix);
        }
    }
}