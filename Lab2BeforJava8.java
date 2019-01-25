class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
}

public class Lab2BeforJava8 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Add Result: " + calculator.add(4, 2));
		System.out.println("Sub Result: " + calculator.sub(4, 2));
		System.out.println("Mul Result: " + calculator.mul(4, 2));
		System.out.println("Div Result: " + calculator.div(4, 2));
	}

}
