import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;

public class Lab3 {

	public static void main(String[] args) {
		//Consumer
		Consumer<String> message = System.out::println;
		message.accept("This is to test Consumer FI");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Solution 1
		Consumer<List<String>> listCon = (l) -> {
			for(String s : l) {
				System.out.println(s);
			}
		};

		listCon.accept(list);
		
		//Solution 2
		list.forEach((item) -> System.out.println(item));
		
		//Solution 3
		list.forEach(System.out::println);
		
		//Predicate
		IntPredicate even = (n) -> n % 2 == 0;
		System.out.println("12 is even: " + even.test(12));
		System.out.println("15 is even: " + even.test(15));
		
		//Supplier
		LongSupplier calender = () -> Calendar.getInstance().getTimeInMillis();
		System.out.println("Calender Supplier: " + calender.getAsLong());
		DoubleSupplier random = () -> Math.random();
		System.out.println("Random Supplier: " + random.getAsDouble());
	}

}
