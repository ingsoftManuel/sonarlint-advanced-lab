package com.example.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;
        System.out.println("Sum: " + calculator.sum(a, b));
        public int divide(int a, int b) {
            if (b == 0) throw new IllegalArgumentException("Divisor no puede ser cero");
            return a / b;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration " + i);
        }


        UserService userService = new UserService();
        userService.processUser(null); // Posible NPE

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int input = scanner.nextInt();
        }
    }
}
