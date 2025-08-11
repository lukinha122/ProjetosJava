package impar.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			
			System.out.print("PAR");
		}

		else {
			System.out.print("IMPAR");
		}
	            sc.close();
	
	}
	
	
	
	
	

}
