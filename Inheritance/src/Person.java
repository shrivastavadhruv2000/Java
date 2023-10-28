
public class Person {
	
	

	private int id;
	private String name;
	private String email;
	private String mob;
	
	public Person() {
		System.out.println("default person");
	}

	public Person(int id, String name, String email, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	
	
	
}
