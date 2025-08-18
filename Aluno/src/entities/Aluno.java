package entities;

public class Aluno {
	
	public String name;
	public double nota1,nota2,nota3;
	
	public double mediaA() {
		return nota1 + nota2 + nota3;
	}
	
	public double result() {
		if (mediaA() < 60.0 ) {
			return 60.0 - mediaA();
		}else {
			return 0.0;
		}
	}

}
