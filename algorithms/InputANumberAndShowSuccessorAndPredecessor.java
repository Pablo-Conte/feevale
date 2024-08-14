package algorithms;

import java.util.Scanner;

class InputANumberAndShowSuccessorAndPredecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int successor = inputNumber + 1;
        int predecessor = inputNumber - 1;

        System.out.printf("The successor of %d is %d and the predecessor is %d.", inputNumber, successor, predecessor);

        scanner.close();
    }
}