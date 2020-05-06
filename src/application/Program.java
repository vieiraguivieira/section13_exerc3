package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		double total = 0;
		Date moment = new Date();
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date bday = sdf1.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus os = OrderStatus.valueOf(sc.next().toUpperCase());
		Client client = new Client(name, email, bday);
		Order order = new Order(moment, os, total);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			Product product = new Product(productName, price);
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, price);
			orderItem.addProduct(product);
			total += price * quantity;
			order.addOrderItem(orderItem);
			System.out.println();
		}
			// instanciar pedido

		// fazer for para: //instanciar produtos //instanciar produtos com pedido
		
		//arrumar a lista. 

		System.out.println(total); //só pra testar
	}

}
