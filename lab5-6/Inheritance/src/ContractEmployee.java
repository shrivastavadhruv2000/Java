import java.time.LocalDate;

public class ContractEmployee extends Employee {
	private int hrs;
	private double charges;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int id, String name, String email, String mob,String dept,String desg, LocalDate doj,int hrs, double charges) {
		super(id,name,email,mob,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}
	public double calculateSal() {
		return hrs*charges;
	}
	

}
