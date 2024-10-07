package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
//get info about phone
     System.out.println("We need to register your phone!\n" +
             "What is your phones serial number?");
     double serialnum = scanner.nextDouble();
     scanner.nextLine();

     System.out.println("phone model?:");
     String phonetype = scanner.nextLine();

     System.out.println("Carrier?: ");
     String service = scanner.nextLine();

     System.out.println("phone number?: ");
     String phonenum = scanner.nextLine();

     System.out.println("your name?: ");
     String name = scanner.nextLine();

     System.out.println("try out your new phone:");
     System.out.println("who would you like to dial?: ");
     String caller = scanner.nextLine();


     CellPhone cellPhone = new CellPhone(serialnum, phonetype, service, phonenum, name, caller);
     cellPhone.setSerialNumber(serialnum);
     cellPhone.setModel(phonetype);
     cellPhone.setCarrier(service);
     cellPhone.setPhoneNumber(phonenum);
     cellPhone.setOwner(name);
     cellPhone.setDial(caller);

     CellPhone newcellphone = new CellPhone();
     newcellphone.setPhoneNumber("555-5555");
     newcellphone.setOwner("mike");
     newcellphone.setCarrier("at&t");
     newcellphone.setModel("iphone");
     newcellphone.setSerialNumber(1);

      System.out.println("name: " + cellPhone.getOwner());
      System.out.println("Serial Number: " + cellPhone.getSerialNumber());
      System.out.println("Model: " + cellPhone.getModel());
      System.out.println("Carrier: " + cellPhone.getCarrier());
      System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
      System.out.println(cellPhone.getOwner() + " is dialling.... " + cellPhone.getDial());
      System.out.println("new contact found! |" +newcellphone.getOwner()+"| |" +newcellphone.getPhoneNumber()+"| "+newcellphone.getCarrier());

     }
    }

