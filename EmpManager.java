import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpManager {
	public static List<Emp> create() {
		List<Emp> list = new ArrayList<>();

		List<String> names = Arrays.asList("Simran", "saloni", "Vaishali", "Vishal", "Usha");
		List<String> depts = Arrays.asList("HR", "Training", "Finance", "Admin");

		Emp emp;
		for (int i = 1; i <= 100; ++i) {
			emp = new Emp();
			emp.setEmpId(i);
			emp.setName(names.get(i % names.size()));
			emp.setDept(depts.get(i % depts.size()));
			emp.setSalary(1000 + (i * Math.random()));

			list.add(emp);
		}
		
		return list;
	}
}
