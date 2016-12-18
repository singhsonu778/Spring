package com.sonu.spring;

public class Logging {

	public void beforeAdvice() {
		System.out.println("Before advice...");
	}

	public void afterAdvice() {
		System.out.println("After advice...");
	}

	public void afterReturning(Object value) {
		System.out.println("Returning : " + value.toString());
	}

	public void afterThrowing(IllegalArgumentException ex) {
		System.out.println("Exception : " + ex.toString());
	}

}