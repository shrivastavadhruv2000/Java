package test;

import com.interfaces.MyInterface;
import com.interfaces.*;

public class TestMyGenericInterface {
	
	public static void main(String [] args) {
		MyInterface ob = (x,y) -> {return x>y ?x:y;};
		System.out.println(ob.compare(12, 15));
		MyGenericInterface<Integer> ob1 = (x,y)->{return x>y?x:y;};
		MyGenericInterface<String> ob2 =(x,y)->{int s=x.compareTo(y);
		if(s<0)
			return x;
		else
			return y;};
	}	
}
