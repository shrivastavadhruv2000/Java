
public class Player {
	private int pno;
	private String pname;
	private String skill;
	public Player() {
		
	}
	public Player(int pno, String pname,String skill) {
		this.pno=pno;
		this.pname=pname;
		this.skill=skill;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String toString() {
		return pno+"\n"+pname+"\n"+skill;
	}

}
