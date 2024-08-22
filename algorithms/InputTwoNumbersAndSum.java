package algorithms;

import java.util.Scanner;

public class InputTwoNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number to sum please: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input a second number please: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        float mult = firstNumber * secondNumber;
        int sub = firstNumber - secondNumber;

        System.out.printf("%d + %d = %d \n", firstNumber, secondNumber, sum);
        System.out.printf("%d x %d = %.1f \n", firstNumber, secondNumber, mult);
        System.out.printf("%d - %d = %d \n", firstNumber, secondNumber, sub);

        scanner.close();
    }
}
