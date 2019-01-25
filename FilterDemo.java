import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Emp> list = EmpManager.create();
		//Salary > x
		list.stream().filter((e) -> e.getSalary() > 1050).forEach(System.out::println);
		
		//Salary < x
		list.stream().filter((e) -> e.getSalary() < 1050).forEach(System.out::println);
		
		//Salary between x, y
		list.stream().filter((e) -> e.getSalary() > 1030 && e.getSalary() < 1060).forEach(System.out::println);
		
		//Dept = x
		list.stream().filter((e) -> e.getDept().equals("HR")).forEach(System.out::println);
		
		//Dept starts with x
		list.stream().filter((e) -> e.getDept().startsWith("T")).forEach(System.out::println);
		
		//Dept ends with x
		list.stream().filter((e) -> e.getDept().endsWith("n")).forEach(System.out::println);
		
		//Dept contains x
		list.stream().filter((e) -> e.getDept().contains("na")).forEach(System.out::println);
		
		//Dept = x or name = y
		list.stream().filter((e) -> e.getDept().equals("Training") || e.getName().equals("Usha")).forEach(System.out::println);
	}

}
