import java.time.LocalDate;

public class Vendor extends Employee {
	private int num_of_emp;
	private int amt;
	public Vendor() {
		super();
	}
	public Vendor(int id, String name, String email, String mob,String dept,String desg,LocalDate doj,int num_of_emp, int amt) {
		super(id,name,email,mob,dept,desg,doj);
		this.num_of_emp = num_of_emp;
		this.amt = amt;
	}
	public int getNum_of_emp() {
		return num_of_emp;
	}
	public void setNum_of_emp(int num_of_emp) {
		this.num_of_emp = num_of_emp;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return super.toString() + "Vendor [num_of_emp=" + num_of_emp + ", amt=" + amt + "]";
	}
	
	

}
