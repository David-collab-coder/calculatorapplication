package git_learn;

public class Calculator {
	
	public int add(int a, int b) {
		return a+ b;
	}
	
	public int subtract(int a, int b) {
		return a -b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(double a, double b) {
		if(b == 0) {
			throw new RuntimeException(b+"Should not be zero");
		}
		return a / b;
	}


	 public double add(double a, double b){
		return a + b;
	 }

	 public double multiply(double a, double b){
		return a+b;
	 }

}
