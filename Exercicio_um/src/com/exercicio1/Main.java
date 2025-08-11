package com.exercicio1;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digitar");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Resultado");
		System.out.println(x+y);
		
		sc.close();
	}

}
