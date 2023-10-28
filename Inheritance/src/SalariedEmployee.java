import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	private int basic_sal;
	private int bonus;
	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(int id, String name, String email, String mob,String dept, LocalDate doj,int basic_sal, int bonus) {
		super(id,name,email,mob,dept,doj);
		this.basic_sal = basic_sal;
		this.bonus = bonus;
	}
	public int getBasic_sal() {
		return basic_sal;
	}
	public void setBasic_sal(int basic_sal) {
		this.basic_sal = basic_sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [basic_sal=" + basic_sal + ", bonus=" + bonus + "]";
	}
	

}
