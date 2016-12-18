package com.sonu.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.sonu.spring.*.*(..))")
	private void selectAll() {
	}

	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Before advice...");
	}

	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("After advice...");
	}

	@AfterReturning(pointcut = "selectAll()", returning = "value")
	public void afterReturning(Object value) {
		System.out.println("Returning : " + value.toString());
	}

	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void afterThrowing(IllegalArgumentException ex) {
		System.out.println("Exception : " + ex.toString());
	}

}