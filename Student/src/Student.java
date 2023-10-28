
public class Student {
	private int  sid;
	private String sname;
	private String lname;
	
	public Student() {
		sid=0;
		sname=null;
		lname=null;
	}
	
	public Student(int sid, String sname, String lname) {
		this.sid=sid;
		this.sname=sname;
		this.lname=lname;
		
	}
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public int getSid() {
		return this.sid;
	}
	
	public void setSname(String sm) {
		this.sname=sm;
	}
	public String getSname() {
		return this.sname;
	}
	
	public void getLname(String lm) {
		this.lname=lm;
	}
	
	public String setLname() {
		return this.lname;
	}
	
	
	public String toString() {
		return "Sid:" + this.sid + "\tSname:" + this.sname +"\tLname:" +this.lname;		
	}
}
