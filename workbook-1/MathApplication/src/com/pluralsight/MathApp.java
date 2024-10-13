package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        /*
    double bobSalary = 90_000;
    double garySalary = 100_000;
    double highestSalary = Math.max(garySalary,bobSalary);

        System.out.println(highestSalary);

    double carPrice = 10_000;
    double truckPrice = 11_000;
    double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println(lowestPrice); */

    float radius = 7.25f;
    double area = (Math.PI * Math.pow(radius,radius));
        System.out.println(area);

    float num = 5.0f;
    double sqrt = Math.sqrt(num);
        System.out.println(sqrt);

    int x1 = 5;
    int y1 = 10;
    int x2 = 85;
    int y2 = 50;
    long result = (long)Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));
        System.out.println(result);

    double absolute = -3.8;
    double value = Math.abs(absolute);
        System.out.println(value);

    double num1 = Math.random();
    if(num1 >= 0 && num1 <=1){
        System.out.println(num1);
    }
    }
}
