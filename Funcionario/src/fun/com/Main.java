package fun.com;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int id;
		double vh;
		double ht;
		double sal;
		
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Nome, Matricula , Horas Trabalhadas e Valor pelas Horas");
		nome = sc.next();
		id = sc.nextInt();
		vh = sc.nextDouble();
		ht = sc.nextDouble();
		sal = ht*vh;
		
		System.out.println("Nome = " + nome );
		System.out.println("Matricula = " + id );
		System.out.printf("Salário = U$%.2f " , sal );
		
		
		
		sc.close();
		

	}

}
