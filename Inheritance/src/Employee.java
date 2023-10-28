import java.time.LocalDate;

public class Employee extends Person {
	private String dept;
	private LocalDate doj;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, String mob,String dept, LocalDate doj) {
		super(id,name,email,mob);
		this.dept = dept;
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [dept=" + dept + ", doj=" + doj + "]";
	}
	

}
