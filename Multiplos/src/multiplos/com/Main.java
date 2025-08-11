package multiplos.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % 2 == 0 && b % 2 == 0) {
			
			System.out.print("São Multiplos");
		}

		else {
			System.out.print("Não São Multiplos");
		}
	            sc.close();

	}

}
