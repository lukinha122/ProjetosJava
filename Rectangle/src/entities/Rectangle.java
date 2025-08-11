package entities;

public class Rectangle {
	
	public double w;
	public double h;
	
	public double Area() {
		return w * h;
	}
	
	public double Perimeter() {
		return 2 * (w + h);
	}
	
	public double Diagonal() {
		return Math.sqrt(w * w + h * h);
		
	}
}
