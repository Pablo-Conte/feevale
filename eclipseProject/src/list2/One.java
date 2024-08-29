package list2;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		//Escreva um algoritmo que receba um número do teclado, se esse número for negativo,   
		//multiplique ele por -5 e mostre o resultado na tela. Se não 
		//for negativo, simplesmente encerre a execução do programa e não 
		//mostre nenhuma mensagem.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Input an number: ");
		double number = scanner.nextDouble();
		
		if (number < 0) {
			double calcResponse = number * -5;
			
			System.out.printf("The number multiplied by -5 is equals: %.2f", calcResponse);
		}
		
		scanner.close();
	}
}
