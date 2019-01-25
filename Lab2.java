import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Lab2 {

	public static void main(String[] args) {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		BinaryOperator<Integer> sub = (a, b) -> a - b;
		BinaryOperator<Integer> mul = (a, b) -> a * b;
		BiFunction<Integer, Integer, Double> div = (a, b) -> (double)a / b;
		
		System.out.println("Add Result: " + add.apply(4, 2));
		System.out.println("Sub Result: " + sub.apply(4, 2));
		System.out.println("Mul Result: " + mul.apply(4, 2));
		System.out.println("Div Result: " + div.apply(5, 0));
	}
}
