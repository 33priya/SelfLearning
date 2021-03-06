
public class Emp {
	private int empId;
	private String name;
	private double salary;
	private String dept;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
}
