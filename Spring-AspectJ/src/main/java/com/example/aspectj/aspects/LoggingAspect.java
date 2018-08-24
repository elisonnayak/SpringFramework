package com.example.aspectj.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.example.aspectj.business.BusinessServices.*(..))")//Point Cut
	public void before(JoinPoint point) {
		//Advice
		System.out.println("Before");
		//System.out.print(point.getSignature().getName() + " called with ");
	}
	
	@After("execution(* com.example.aspectj.business.BusinessServices.*(..))")
	public void after(JoinPoint point) {
		System.out.println("After");
		//System.out.print(point.getSignature().getName() + " called with ");
	}
	
	@AfterReturning(pointcut="execution(* com.example.aspectj.business.BusinessServices.*(..))",returning = "returnVal")
	public void returnedByMe(JoinPoint point, Object returnVal) {
		System.out.println("After returning");
		System.out.println("result is " + returnVal);

	}
	
	
}
