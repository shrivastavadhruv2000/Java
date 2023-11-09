
public class Members extends Person {
	private String type_of_membership;
	private int amp;
	public Members() {
		System.out.println("Members default");
	}
	public Members(int id, String name, String email, String mob,String type_of_membership, int amp) {
		super(id,name,email,mob);
		this.type_of_membership = type_of_membership;
		this.amp = amp;
	}
	public String getType_of_membership() {
		return type_of_membership;
	}
	public void setType_of_membership(String type_of_membership) {
		this.type_of_membership = type_of_membership;
	}
	public int getAmp() {
		return amp;
	}
	public void setAmp(int amp) {
		this.amp = amp;
	}
	@Override
	public String toString() {
		return super.toString() + "Members [type_of_membership=" + type_of_membership + ", amp=" + amp + "]";
	}
	
}
