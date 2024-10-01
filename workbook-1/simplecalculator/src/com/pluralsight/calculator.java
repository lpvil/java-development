package com.pluralsight;

import java.util.Scanner;

public class calc {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double numbers=getnumbers()
    }

    public static Float getnumbers() {
        System.out.println("Type in a number: ");
        float num1 = scanner.nextFloat();
        System.out.println("Type in a second number: ");
        float num2 = scanner.nextFloat();
        scanner.nextLine();
    }

    public static String operations() {
        System.out.println("Pick an operation:" +
                "\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide");
        String choice = scanner.nextLine();
    }

    public static Float result(){

    }

}
