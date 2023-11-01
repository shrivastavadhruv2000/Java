package test;

import com.beans.Class2;
import com.beans.MyClass;
import com.interfaces.Interface1;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob=new MyClass();
		ob.f11();
		ob.f21();
		System.out.println( Interface1.i);
		Class2 c2=new Class2();
		c2.display();
		
	}

}
