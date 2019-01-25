package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager {

	private List<Dept> listDept = new ArrayList<>();

	public void create(Dept dept) {
		listDept.add(dept);
	}

	public List<Dept> getAllDept() {
		return listDept;
	}

	public boolean update(Dept dept) {
		/*for(Dept d : listDept) {
			if (d.getDeptNo() == dept.getDeptNo()) {
				d.setDeptName(dept.getDeptName());
				d.setLocation(dept.getLocation());
				return true;
			}
		}

		return false;*/

		listDept.replaceAll((d) -> {
			if (d.getDeptNo() == dept.getDeptNo()) {
				return dept;
				/*d.setDeptName(dept.getDeptName());
				d.setLocation(dept.getLocation());*/
			} 
			return d;
		});
		return true;
	}

	public boolean delete(int deptNo) {
		/*Iterator<Dept> iterator = listDept.iterator();
		while (iterator.hasNext()) {
			Dept d = iterator.next();
			if (d.getDeptNo() == deptNo) {
				iterator.remove();
				return true;
			}
		}

		return false;*/

		return listDept.removeIf((d)-> d.getDeptNo() == deptNo);
	}
	
	public boolean delete(Predicate<Dept> predicate) {
		return listDept.removeIf(predicate);
	}
}
