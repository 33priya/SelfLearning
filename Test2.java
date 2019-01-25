import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		DeptManager deptManager = new DeptManager();
		deptManager.create(new Dept());
		
		EmpManager empManager = new EmpManager();
		empManager.create(new Emp());
	}

}

interface Manager<T> {
	public List<T> getList();
	
	public default void create(T t) {
		System.out.println("Create of Manager");
		getList().add(t);
	}
}

class Dept {}
class DeptManager implements Manager<Dept> {
	
	List<Dept> list = new ArrayList<>();
	
	@Override
	public List<Dept> getList() {
		return list;
	}
}

class Emp{}
class EmpManager implements Manager<Emp> {
	
	List<Emp> list = new ArrayList<>();
	
	@Override
	public List<Emp> getList() {
		return list;
	}
	
	public void create(Emp e) {
		System.out.println("Create of Emp Manager");
		list.add(e);
	}
}
