package com.hillel.dehtiar_yaroslav;

import java.util.Scanner;

public class YourAge {
    public static void main(String[] args) {
        System.out.println("Enter your year of birth :");
        Scanner scanner = new Scanner(System.in);
        int currentYear = 2022;
        int enteredBirth = scanner.nextInt();
        int result = (currentYear - enteredBirth);
        System.out.println("You are " + result + " years old.");
    }
}
