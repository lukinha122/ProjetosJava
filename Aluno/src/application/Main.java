package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
			Aluno aluno = new Aluno();
			
			
			  aluno.name = sc.nextLine(); 
			  aluno.nota1 = sc.nextDouble(); 
			  aluno.nota2 = sc.nextDouble(); 
			  aluno.nota3 = sc.nextDouble(); 
			   
			  System.out.printf("FINAL GRADE = %.2f%n", aluno.mediaA()); 
			   
			  if (aluno.mediaA() < 60.0) { 
			   System.out.println("FAILED"); 
			   System.out.printf("MISSING %.2f POINTS%n", aluno.result()); 
			  } 
			  else { 
			   System.out.println("PASS"); 
			  } 
			  sc.close();
	}

}
