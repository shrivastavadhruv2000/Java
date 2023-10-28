
public class Student {

	private String id;
	private String name;
	private int m1,m2,m3;
	static int count;
	static {
		count=0;
	}
	public static void f1() {
		
	}
	private String generateCode() {
		count++;
		if(this.name!=null) {
			return this.name.substring(0,3)+count;
		}
		else {
			return "aaa"+count;
		}
	}
	public Student() {
		this(null,0,0,0);
	}
	public Student(String nm,int m1,int m2,int m3) {
		this.name=nm;
		this.id=generateCode();
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void setName(String nm) {
		this.name=nm;
	}
	public void setM1(int m1) {
		this.m1=m1;
	}
	public void setM2(int m2) {
		this.m2=m2;
	}	
	public void setM3(int m3) {
		this.m3=m3;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	public int getm1(int m1) {
		return this.m1;
	}
	public int getm2(int m2) {
		return this.m2;
	}
	public int getm3() {
		return this.m3;
	}
	public String toString() {
		return "id:" + this.id +"\nName: " + this.name +"\nm1: " +  this.m1 + "\nm2: " + this.m2 + "\nm3: " + this.m3;
	}
}
