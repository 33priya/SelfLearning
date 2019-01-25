package functionalinterface;

public class Client {

	public static void main(String[] args) {
		DeptManager manager = new DeptManager();
		
		Dept dept = null;
		for(int index = 0; index < 10; ++index) {
			dept = new Dept(index, "DeptName "+ index, index % 2 == 0 ? "Hyd" : "Bengaluru");
			manager.create(dept);
		}
	
		manager.getAllDept().forEach(System.out::println);
		
		Dept de = new Dept(7, "HR", "Pnq");
		manager.update(de);
		System.out.println("****************** After Update *****************");
		manager.getAllDept().forEach(System.out::println);
		
		System.out.println("****************** Befor Delete *****************");
		
		System.out.println("Dept No 4 is deleted: " + manager.delete((dept1) -> dept1.getDeptNo() == 4));
		System.out.println("Dept for Hyd location are deleted: " + manager.delete((dept1) -> dept1.getLocation().equals("Hyd")));
		System.out.println("Dept with name DeptName 1 is deleted: " +manager.delete((dept1) -> dept1.getDeptName().equals("DeptName 1")));
		System.out.println("Dept No > 5 and with Dept Name HR is Deleted: " + manager.delete((dept1) -> dept1.getDeptNo() > 5 && dept1.getDeptName().equals("HR")));
		
		System.out.println("****************** After Delete *****************");
		manager.getAllDept().forEach(System.out::println);
	}
}
