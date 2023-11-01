package com.beans;

import com.interfaces.Interface1;
import com.interfaces.Interface2;

public class MyClass implements Interface1, Interface2{
	
	public int f12() {
		System.out.println();
		return 0;
	}
	
	public void f22() {
		System.out.println("in f22");
	}
	
	public void f11() {
		System.out.println("in f11");
	}
	
	public void f21() {
		Interface1.super.f21();
		Interface2.super.f21();
		System.out.println("extra code");
	}
}
