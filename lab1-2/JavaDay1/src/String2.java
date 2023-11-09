
public class String2 {
	public static void main(String[] args) {
		String s="Testing";
		System.out.println("Uppercase"+s.toUpperCase());
		System.out.println("lowercase"+s.toLowerCase());
		System.out.println("Character "+s.charAt(0));
		System.out.println("lengeth"+ s.length());
		
		
		String t1="ABC,PQR,XYZ";
		System.out.println(t1.split(","));
		System.out.println("substring "+s.substring(3,6));
		System.out.println("substring "+s.substring(3));
		System.out.println("index of "+s.indexOf("i"));
		System.out.println("last indexof "+s.lastIndexOf("t"));
		
		
		String[] sarr=t1.split(",");
		System.out.println(sarr);
		StringBuilder sb=new StringBuilder("string builder");
		sb.append("test append");
		System.out.println(sb);
	}

}
