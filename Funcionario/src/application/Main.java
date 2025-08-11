package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		System.out.print("Name:" );
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSal = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.printf("Employeer:" + employee);
		System.out.println();
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		
		System.out.println();
		System.out.printf("Update data: " +  employee);
		
		
		
		
		sc.close();
		
		
		
			

	}

}
