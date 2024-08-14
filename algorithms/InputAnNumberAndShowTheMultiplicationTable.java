package algorithms;

import java.util.Scanner;

class InputAnNumberAndShowTheMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}