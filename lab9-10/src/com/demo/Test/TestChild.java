package com.demo.Test;

import java.util.Scanner;

import com.demo.Beans.child;

import ProtectedMethod.ProtectedClass;

public class TestChild {


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a1;
		a1=sc.nextInt();
		
		child c1=new child("tejal","vinayak","thakare");
		System.out.println(c1);
//		here you need to make the protected member public to access it 
		ProtectedClass pc=new ProtectedClass(a1);
		System.out.println(pc);
		
		
		

	}

}
