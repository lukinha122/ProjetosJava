package cod.exer;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cd1 ,cd2, np1 ,np2 ;
		double vu1,vu2, total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		cd1 = sc.nextInt();
		np1  = sc.nextInt();
		vu1  = sc.nextDouble();
		cd2 = sc.nextInt();
		np2  = sc.nextInt();
		vu2  = sc.nextDouble();
		
		total = np1 * vu1 + np2 * vu2;
		 
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
