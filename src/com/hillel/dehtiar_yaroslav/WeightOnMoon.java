package com.hillel.dehtiar_yaroslav;

import java.util.Scanner;

public class WeightOnMoon {
    public static void main(String[] args) {
        System.out.println("Enter your weight :");

        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("Your weight on the Moon :" + (weight / 1.6));
    }
}
