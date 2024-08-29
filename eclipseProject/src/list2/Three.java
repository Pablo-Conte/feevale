package list2;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		/*
		 * Queremos determinar o consumo médio, por kilômetro, de combustível de um 			carro. Para isso, faça um programa que receba a distância total percorrida 			pelo automóvel, em kilômetros, e o total de combustível gasto, em litros. 			Calcule o consumo médio, por kilômetro com a seguinte fórmula: Consumo médio = 			Quantidade de Kilômetros percorridos / Total de combustível gasto. Se o valor do 			consumo médio for maior do que 10 mostre a mensagem: “Carro econômico”.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Input the total distance: ");
		double totalDistance = scanner.nextDouble();
		
		System.out.printf("Input the amount of wasted fuel: ");
		double wastedFuel = scanner.nextDouble();
		
		double mediaOfWasteOfFuel = totalDistance / wastedFuel;
		
		if (mediaOfWasteOfFuel > 10) {
			System.out.println("Economic Car!");
		}
		
		
	}
}
