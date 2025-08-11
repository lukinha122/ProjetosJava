package exer3.com;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		
		int  A, B , C , D , Def;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitar");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Def = (A* B - C * D);
		System.out.println("Diferença = " + Def);
		
		sc.close();
	}

}
