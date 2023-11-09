
public class String1 {
	public static void main(String[] args) {
		String s ="Hello";
		String s1="Hello";
		String s2="welcome";
		String s3="welcome";
		s=s+"world!!";
		String s4="Hello";
		String s5=new String("Hello");
		System.out.println("s3==s4" +(s3==s4));//Check both s3 and s5 pointing to the same object or not.
		System.out.println("s1==s5=" +(s1==s5));
		System.out.println("s3.eqals(s5)=" +s3.equals(s5));//it will check the values are  same or not.
		System.out.println(s3.compareTo(s5));//comparing the ascii value of 1st character of both the strings
		
	}

}
