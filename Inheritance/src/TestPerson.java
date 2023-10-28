import java.time.LocalDate;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Members m1=new Members(1,"abc","asghf@uej","54444","quaterly",5000);
		System.out.println(m1);
		
		Vendor v = new Vendor(111,"abc","asghf@uej","54444","HR",LocalDate.of(2023, 12, 25),5,54000);
		System.out.println(v);
		
		Employee e1= v;
		System.out.println(e1);
		
	
//		
//		Person p=new Members();
//	    System.out.println(p);
//       
	}

}
