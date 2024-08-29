package list2;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		/*
		 *  Escreva um algoritmo que receba o peso de uma melancia. Se o peso for menor do 			que 5kg, mostre a mensagem: "Melancia será vendida na promoção".
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the weigth of a watermelon: ");
		double weightOfTheWaterMelon = scanner.nextDouble();
		
		if (weightOfTheWaterMelon < 5) {
			System.out.println("Watermelon must be selled in promotion");
		}
		
		scanner.close();
	}
}
