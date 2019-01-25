import java.util.List;
import java.util.Scanner;

public class LimitSkipDemo {
	public static void main(String[] args) {
		List<Emp> list = EmpManager.create();
		
		//Simple limit
		list.stream().limit(10).forEach(System.out::println);
		
		//limit + skip
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter y to see next records");
		String input = scanner.next();
		if (input.equalsIgnoreCase("Y")) {
			list.stream().skip(10).limit(10).forEach(System.out::println);
		}*/
		
		//Pagination using skip + limit
		int count = 15, start = 0, max = list.size();
		
		do {
			list.stream().skip(start).limit(count).forEach(System.out::println);
			start += count;
			System.out.println("Press Y to continue..");
		} while (scanner.next().equalsIgnoreCase("Y") && start < max);
		
		scanner.close();
	}
}
