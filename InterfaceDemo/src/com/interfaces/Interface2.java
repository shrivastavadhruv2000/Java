package com.interfaces;

public interface Interface2 {
	int f12();
	void f22();
	void f11();
	default void f21() {
		System.out.println("in function f2 in interface 2");
	}

}
