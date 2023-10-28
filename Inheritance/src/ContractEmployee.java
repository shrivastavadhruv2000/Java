import java.time.LocalDate;

public class ContractEmployee extends Employee {
	private int hrs;
	private int charges;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int id, String name, String email, String mob,String dept, LocalDate doj,int hrs, int charges) {
		super(id,name,email,mob,dept,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}
	

}
