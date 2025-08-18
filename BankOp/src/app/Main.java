package app;

import java.util.Locale;
import java.util.Scanner;

import utilities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in) ;
		Account account ;
		
		
		System.out.print("Entre com o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o títular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial (y/n) ?: ");
		char resp = sc.next().charAt(0);
			if ( resp == 'y' ) {
				System.out.print("Entre com um valor inicial : ");
				double initialDeposit = sc.nextDouble();
				account = new Account (number, holder, initialDeposit);
			}
			else {
				account = new Account (number, holder);
			}
			
			
				System.out.println();
				System.out.println("Atualização da conta: " );
				System.out.println(account);
			  
			  
				System.out.println();
				System.out.print("Digite um valor para depósito: ");
				double valorDeposito = sc.nextDouble();
				account.deposito(valorDeposito);
				System.out.println("Atualização da conta: ");
				System.out.println(account);
			  
			  
				System.out.println();
				System.out.print("Digite um valor para saque: ");
				double valorSaque = sc.nextDouble();
				account.withdraw(valorSaque);
				System.out.println("Atualização da conta: ");
				System.out.println(account);	
			  
			  sc.close();
			  
			  

	}

}
