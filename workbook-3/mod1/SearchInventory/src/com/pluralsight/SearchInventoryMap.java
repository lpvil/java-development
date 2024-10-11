package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class SearchInventoryMap {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, String> searchMap = new HashMap<>();
        try {

            FileReader fileReader = new FileReader("src\\com\\pluralsight\\inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String file;
            while ((file = bufferedReader.readLine()) != null) {
                String[] products = file.split("\\|");
                int id = Integer.parseInt(products[0]);
                String prodDetails = ("product id: " + id + " product name: " + products[1]);
                searchMap.put(id, prodDetails);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Enter product id to search for item: ");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println(searchMap.get(itemId));
        System.out.println("would you like to search again?");

        itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println(searchMap.get(itemId));

        String answer = scanner.nextLine();
        if (answer.startsWith("yes".toLowerCase())){
            System.out.println(itemId);}
            else{
                System.out.println("good bye!");
            }
        }
    }
