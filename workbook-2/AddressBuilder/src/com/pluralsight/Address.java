package com.pluralsight;

import java.util.Scanner;

public class Address {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        //get billing and shipping address
        //create a stringbuilder to add to info.
        System.out.println("please enter the following information: "
        + "\nFull Name, Billing street, Billing city, Billing state, Billing zip: ");

        StringBuilder billing1= new StringBuilder();
        billing1.append("Full Name: "+ scanner.nextLine() +" \n");
        billing1.append("Billing Street: "+ scanner.nextLine() +" \n");
        billing1.append("Billing City: "+ scanner.nextLine() +" \n");
        billing1.append("Billing State: "+ scanner.nextLine() +" \n");
        billing1.append("Billing Zip: "+ scanner.nextLine() +" ");
        String myInfo =billing1.toString();
        System.out.println(myInfo);

        System.out.println("Who and where do you want to ship to?: " +
                "\nFull Name, shipping street, shipping city, shipping state, shipping zip: ");
        StringBuilder shipping= new StringBuilder();
        shipping.append("Full Name: "+ scanner.nextLine() +" \n");
        shipping.append("Shipping Street: "+ scanner.nextLine() +" \n");
        shipping.append("Shipping City: "+ scanner.nextLine() +" \n");
        shipping.append("Shippng State: "+ scanner.nextLine() +" \n");
        shipping.append("Shipping Zip: "+ scanner.nextLine() +" ");
        String myShip =shipping.toString();
        System.out.println(myInfo + myShip);
    }
}
