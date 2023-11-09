import java.util.Arrays;

public class Team {
	private int tno;
	private String tname;
	private Player captain;
	private Player[] plist;
	public Team() {
		
	}
	public Team(int tno,String tname,Player captain,Player[] plist) {
		this.tno=tno;
		this.tname=tname;
		this.captain=captain;
		this.plist=plist;
	}
	
	
	public void setTno() {
		this.tno=tno;
		
	}
	public int getTno() {
		return tno;
	}
	
	public void setTname() {
		this.tname=tname;
		
	}
	public String getTname() {
		return this.tname=tname;
	}
	
	public void setCaptain(Player captain) {
		this.captain=captain;
		
	}
	public Player getCaptain() {
		return captain;
	}
	
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist=plist;
	}
	@Override
	public String toString() {
		return tno+"\n"+tname+"\n"+captain+"\n" + Arrays.toString(plist);
	}

}
