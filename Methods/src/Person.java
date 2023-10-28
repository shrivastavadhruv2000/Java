
public class Person {
	private int pid;
	private String pname;
	private String pmob;
	public Person() {
		pid=0;
		pname=null;
		pmob=null;
		
	}
	public Person(int pid,String pname,String pmob) {
		this.pid=pid;
		this.pname=pname;
		this.pmob=pmob;
	}
	public void setpid(int pid) {
		this.pid=pid;
	}
	public void setpname(String nm) {
		this.pname=nm;
	}
	public void setMob(String m) {
		this.pmob=m;
	}
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return pname;
	}
	public String getMobile() {
		return pmob;
	}

	public String toString() {
		return "pid:" +this.pid +"\nName :" +this.pname + "\nMobile" + this.pmob;
	}
}
