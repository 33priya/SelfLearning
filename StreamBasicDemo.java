import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamBasicDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(3);
		list.add(13);
		list.add(101);
		list.add(4000);
		
		Optional<Integer> min = list.stream().min((n1, n2)-> n1.compareTo(n2));
		if (min.isPresent())
			System.out.println("Min: " +min.get());
		
		
		IntStream i1 = list.stream().mapToInt(x -> x.intValue());
		System.out.println("Min: " + i1.min().getAsInt());
		IntStream i2 = list.stream().mapToInt(x -> x.intValue());
		System.out.println("Max: " + i2.max().getAsInt());
		IntStream i3 = list.stream().mapToInt(x -> x.intValue());
		System.out.println("Avg: " + i3.average().getAsDouble());
		
		IntStream i4 = list.stream().mapToInt(x -> x.intValue());
		i4.sorted().forEach(System.out::println);
	}

}
