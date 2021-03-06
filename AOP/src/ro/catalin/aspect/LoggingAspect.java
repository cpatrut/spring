package ro.catalin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect {

	// @Before("execution(public String ro.catalin.model.Circle.getName() )")
	// public void LoggingAdvice() {
	// System.out.println("advice run. 11111 method called");
	// }

	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue=null;
		try {
			System.out.println("Before advice");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("Finally");
		
		return returnValue;
	}

	public void allCircleMethdos() {

	}
	public void logginAdvice(){
		System.out.println("loggin advice");
	}
	}
