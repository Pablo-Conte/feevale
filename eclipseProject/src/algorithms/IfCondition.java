package algorithms;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que receba um número do teclado, se esse número 
		 * for maior do que 20, multiplique ele por 2 e mostre o resultado na tela.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double number = scanner.nextDouble();
		
		if (number > 20) {
			double doubledNumber = number * 2;
			
			System.out.printf("The double of the inputed number is: %.2f", doubledNumber);
		} else {
			System.out.println("Nothing was done");
		}
		
		scanner.close();
	}
}
