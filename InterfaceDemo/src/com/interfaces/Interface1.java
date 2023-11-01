package com.interfaces;

public interface Interface1 {
	int i=23;
	void f11();
	
	default void f21() {
		System.out.println("int fun f2");
	}
	
	public static void f31() {
		System.out.println("in static methods");
	}
}
