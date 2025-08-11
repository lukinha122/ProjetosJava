package cond1.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		  if  (a < 0 ) {
			  
			  System.out.print("Negativo");
		  } else {
			System.out.print("Não Negativo");  
			
		  }
		
		sc.close();
 
	}

}
