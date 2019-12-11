package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date dateOfBirth = sdf.parse(sc.next());
		Client client = new Client(name, email, dateOfBirth);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		Order order = new Order(status);
		OrderItem orderItem = new OrderItem(quantity);
		String productName;
		
		
		for (int i = 1; i <= quantity; i++) {
			System.out.println("Enter  #" + i + " item data:");
			System.out.print("Product name: ");
			
		}
		sc.close();
	}
	
	
}
