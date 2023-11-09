
public class Person {
	
	

	private int id;
	private String pname;
	private String email;
	private String mobile;
	
	public Person() {
		System.out.println("default person");
	}

	public Person(int id, String pname, String mob,String email) {
		super();
		this.id = id;
		this.pname = pname;
		this.email = email;
		this.mobile = mobile;
	}

	public int getPid() {
		return id;
	}

	public void setPid(int pid) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + pname + ", email=" + email + ", mob=" + mobile + "]";
	}
	
	
	
}
