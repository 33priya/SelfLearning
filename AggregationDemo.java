import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AggregationDemo {

	public static void main(String[] args) {
		List<Emp> list = EmpManager.create();
		//Total Salary for name x
		Predicate<Emp> pred1 = (e) -> e.getName().equals("Usha");
		double total = list.stream().filter(pred1).mapToDouble((e) -> e.getSalary()).sum();
		System.out.println("total salary : " +total);

		list.stream().map((e) -> e.getDept()).distinct().forEach(System.out::println);
		
		//Total salaries of employees group by Dept
		Map<String, Double> mapSalary = list.stream()
				.collect(Collectors.groupingBy((e) -> e.getDept(), Collectors.summingDouble((e) -> e.getSalary()))); 
		
		System.out.println(mapSalary);
		
		double totalSalary = mapSalary.values().stream().mapToDouble((x) -> x.doubleValue()).sum();
		System.out.println("Grand Salary" + totalSalary);
		
		
		//Total no of employees group by name
		Map<String, Long> mapCount = list.stream()
				.collect(Collectors.groupingBy((e) -> e.getName(), Collectors.counting())); 
		System.out.println(mapCount);
		
		long totalCount = mapCount.values().stream().mapToLong((x) -> x.longValue()).sum();
		System.out.println("Total no of Emp: " + totalCount);
	}

}
