import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<Emp> list = EmpManager.create();
		list.stream().map((e) -> {
			e.setName(e.getName().toUpperCase());
			return e;})
		.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
		.forEach(System.out::println);

		list.stream().map((e) -> e.getSalary()).sorted().forEach(System.out::println);
	}

}
