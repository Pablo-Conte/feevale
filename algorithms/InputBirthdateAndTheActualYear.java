package algorithms;

import java.util.Scanner;

public class InputBirthdateAndTheActualYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate year: ");
        int birthdateYear = scanner.nextInt();

        System.out.print("Enter the actual year: ");
        int actualYear = scanner.nextInt();

        int calculatedAgeOfThePerson = actualYear - birthdateYear;

        System.out.printf("You're %d years old.", calculatedAgeOfThePerson);

        scanner.close();
    }
}
