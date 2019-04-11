package belajarTest;

public class Calculator {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		int b = a.add(10, 5);
		System.out.println(b);
		
	}

	public int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
}
