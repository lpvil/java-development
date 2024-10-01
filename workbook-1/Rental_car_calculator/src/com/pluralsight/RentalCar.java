package com.pluralsight;

import java.util.Scanner;


public class RentalCar{
   static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
    date();
    numofdays();
    }
    public static void date() {
        System.out.println("What day would you like to pick up?" +
                "\nMonday,Tuesday,Wednesday,Thursday,Friday\nSaturday and " +
                "Sunday we are closed: ");
        String DOW = scanner.nextLine().toUpperCase();

        if (DOW.equals("MONDAY")) {
            System.out.println("Great!: ");
        } else if (DOW.equals("TUESDAY")) {
            System.out.println("Great!:");
        } else if (DOW.equals("WEDNESDAY")) {
            System.out.println("Great!:");
        } else if (DOW.equals("THURSDAY")) {
            System.out.println("Great!:");
        } else if (DOW.equals("FRIDAY")) {
            System.out.println("Great!:");
        } else System.out.println("sorry we are closed!");
    }

     public static void numofdays(){
         System.out.println("How many days will you need the rental?");
         int num= scanner.nextInt();
         scanner.nextLine();

         if (num >=1 && <=15){
         System.out.println("no problem");}
         else if (num >=16){
         System.out.println("sorry we have a 15 day limit");}
         else{
             System.out.println("not valid!!!!");}
         }
     public static double options(double total) {
         System.out.println("would you like to add the electronic toll tag?: Y or N? ");
         String op1 = scanner.nextLine().toUpperCase();
         double basicPrice=29.99;

         if (op1.equals("Y")) {
             System.out.println("great ill add that on");
             double add1 = total + 3.95;
         } else {
             System.out.println("no problem");
         }

         System.out.println("would you like GPS?: ");
         String op2= scanner.nextLine().toUpperCase();

         if (op2.equals("Y")) {
             System.out.println("great ill add that on");
             double add2 = total + 2.95;
         } else {
             System.out.println("no problem");
         }

         System.out.println("Would you like roadside assistance?: ");
         String op3= scanner.nextLine();

         if (op3.equals("Y")) {
             System.out.println("great ill add that on");
             double add3 = total + 3.95;
         } else {
             System.out.println("no problem");
         }
         return total;
     }}