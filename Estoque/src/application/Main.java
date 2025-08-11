package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Product product = new Product();
		System.out.println("Enter Product data :  ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock:");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:" );
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:" );
		quantity = sc.nextInt();
		product.removeProcuts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
