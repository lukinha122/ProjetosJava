package entities;

public class Employee {

	public String name;
	public double grossSal;
	public double tax;
	
	public double netSalary(){
		return grossSal - tax ;
		
	}
	public void increaseSalary(double percent) {
		grossSal += grossSal * percent / 100.0;
		
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f" , netSalary());
			
		
	}
	
}
