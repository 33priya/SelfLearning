package functionalinterface;

public class Dept {
	private int deptNo;
	private String deptName;
	private String location;
	
	public Dept(int deptNo, String deptName, String location) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + "]";
	}
}
