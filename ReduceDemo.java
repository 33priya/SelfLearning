import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<String> list = Stream.of("aa", "bb", "cc", "dd").collect(Collectors.toList());
		String str = list.stream().reduce((s1, s2) -> {return s1 + s2;}).toString();
		System.out.println("Result:" + str);
		
		IntStream intStream = IntStream.of(10, 20, 30, 70, 40);
		int sum = intStream.reduce((i1, i2) -> i1 + i2).getAsInt();
		System.out.println("Sum:" + sum);
		
		int min = intStream.reduce((i1, i2) -> i1 > i2 ? i2 : i1).getAsInt();
		System.out.println("Min:" + min);
		
		int max = intStream.reduce((i1, i2) -> i1 > i2 ? i1 : i2).getAsInt();
		System.out.println("Max:" + max);
	}

}
