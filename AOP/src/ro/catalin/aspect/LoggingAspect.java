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

@Aspect
public class LoggingAspect {

	// @Before("execution(public String ro.catalin.model.Circle.getName() )")
	// public void LoggingAdvice() {
	// System.out.println("advice run. 11111 method called");
	// }

	@Before("allCircleMethdos()")
	public void allGetters(JoinPoint joinPoint) {
		System.out.println("advice run." + joinPoint.toString()
				+ " method called");
	}

	@AfterReturning("args(name)")
	public void stringArgumentsMethod(String name) {
		System.out.println("a method that takes string args,value:" + name);
	}

	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("throing advice");
	}

	@Around("allCircleMethdos()")
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

	@Pointcut("within(ro.catalin.model.Circle)")
	public void allCircleMethdos() {

	}

}
