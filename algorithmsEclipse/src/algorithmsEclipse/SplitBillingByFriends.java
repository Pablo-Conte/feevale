package algorithmsEclipse;

import java.util.Scanner;

public class SplitBillingByFriends {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("You guys went on a deluxe restaurant and now you need to split the \nbilling, you have the idea to create a automatizated app to do this calc");
		System.out.println("--------------------");
		
		System.out.print("\nInput the quantity of friend you have: ");
		int quantityOfFriends = scanner.nextInt();
		
		System.out.print("Input the total amount of the billing: R$");
		double totalBillValue = scanner.nextFloat();
		
		double billByFriend = totalBillValue / quantityOfFriends;
		
		System.out.printf("The billing of each friend is: R$%.2f", billByFriend);

		scanner.close();
	}
}
