package list2;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que receba a idade de uma pessoa. Se a idade for maior ou 			igual a 60 anos imprima a mensagem "Pessoa idosa". 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Input the person age: ");
		double age = scanner.nextDouble();
		
		if (age >= 60) {
			System.out.println("Elder person");
		}
		
		scanner.close();
	}
}
