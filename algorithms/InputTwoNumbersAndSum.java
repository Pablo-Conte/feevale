package algorithms;

import java.util.Scanner;

public class InputTwoNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number to sum please: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input a second number please: ");
        int secondNumber = scanner.nextInt();

        int total = firstNumber + secondNumber;

        System.out.printf("%d + %d = %d", firstNumber, secondNumber, total);

        scanner.close();
    }
}
