
public class Test {

	public static void main(String[] args) {
		/*Operation add = new Add();
		Operation sub = new Sub();
		Operation mul = new Mul();
		Operation div = new Div();
		System.out.println("Add Result: " + add.process(4, 2));
		System.out.println("Sub Result: " + sub.process(4, 2));
		System.out.println("Mul Result: " + mul.process(4, 2));
		System.out.println("Div Result: " + div.process(4, 2));*/
		
		Operation<Integer> add = (i, j) -> i + j;
		Operation<Integer> sub = (i, j) -> i - j;
		Operation<Integer> mul = (i, j) -> i * j;
		Operation<Integer> div = (i, j) -> i / j;
		System.out.println("Add Result: " + add.process(4, 2));
		System.out.println("Sub Result: " + sub.process(4, 2));
		System.out.println("Mul Result: " + mul.process(4, 2));
		System.out.println("Div Result: " + div.process(4, 2));
		
		Operation<Double> addDouble = (i, j) -> i + j;
		System.out.println("Add Result Double: " + addDouble.process(4d, 2d));
		
		Operation<String> addStr = (i, j) -> i + j;
		System.out.println("Add Result String: " + addStr.process("Priya", "Singh"));
	}
}

@FunctionalInterface
interface Operation<T> {
	T process(T a, T b);
	//SAM - Single Abstract Method - there must be only one abstract method in FI
	//void add();
}

/*class Add implements Operation {
	@Override
	public int process(int a, int b) {
		return a + b;
	}
}

class Sub implements Operation {
	@Override
	public int process(int a, int b) {
		return a - b;
	}
}

class Mul implements Operation {
	@Override
	public int process(int a, int b) {
		return a * b;
	}
}

class Div implements Operation {
	@Override
	public int process(int a, int b) {
		return a / b;
	}
}*/

