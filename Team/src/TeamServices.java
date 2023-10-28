import java.util.Arrays;
import java.util.Scanner;

public class TeamServices{
	static Team[] tarr;
	static int cnt;
	static {
		tarr=new Team[10];
		/*Player[] plist= new Player[3];
		plist[0]=new Player(01,"yuvraj","all");
		plist[1]=new Player(02,"raina","batter");
		plist[2]=new Player(03,"jaddu","all");
	*/	
		//tarr[0] =new Team(1,"abc",0,"Dhoni","wk",plist);
		cnt=0;
	}	
	public static void addNewTeam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Team no : ");
		int tno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Team Name : ");
		String tname=sc.nextLine();
		
		System.out.println("Enter the Captain Player Number : ");
		int pno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Player Name : ");
		String pname=sc.nextLine();
		
		System.out.println("Enter the Skills : ");
	    String skill=sc.nextLine();
	    
	    Player c=new Player(pno,pname,skill);
	    
	    Player[] plist=new Player[3];
	    for (int i=0;i<plist.length;i++) {
	    	System.out.println("player number");
			pno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name");
			pname=sc.nextLine();
			
			System.out.println("enter skill");
			skill=sc.nextLine();
			plist[i]=new Player(pno,pname,skill);
	    	
	    }
	    tarr[cnt]=new Team(tno,tname,c,plist);
	    cnt++;
	    
	    
		
	}
	public static void displayAllTeams() {
		for(int i=0;i<cnt;i++) {
			System.out.print(tarr[i]);
			System.out.println('\n');
		}
		
	}
	public static Team searchByCaptain(String name) {
		for(int i=0;i<cnt;i++) {
			if(tarr[i].getCaptain().getPname().equals(name)) {
				return tarr[i];
			}
		}
		return null;
		
	}
}
