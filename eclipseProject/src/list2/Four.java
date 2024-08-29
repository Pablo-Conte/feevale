package list2;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que receba a quantidade de pessoas que compraram celular 		iPhone no mês de janeiro, na loja iCel. Se o número de pessoas for maior do que 200 		mostre a mensagem: "mês com vendas acima do esperado"
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the quantity of users that buy an iphone in january: ");
		double quantityOfIphoneBuyers = scanner.nextDouble();
		
		if (quantityOfIphoneBuyers > 200) {
			System.out.println("month with high number of sales");
		}
	}
}
