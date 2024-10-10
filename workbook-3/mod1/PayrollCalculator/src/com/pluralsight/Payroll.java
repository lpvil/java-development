package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\lpvil\\Desktop\\pluralsight" +
                    "\\java-development\\workbook-3\\mod1\\PayrollCalculator\\src\\com\\pluralsight\\employees.csv");
            FileReader fr = new FileReader("employees.csv");
            BufferedReader br = new BufferedReader(fr);

            String text;
            while((text = br.readLine()) != null){
                String[] div = text.split("\\|");
                System.out.println(text);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }

    }