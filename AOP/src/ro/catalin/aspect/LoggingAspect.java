package ro.catalin.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String ro.catalin.model.Circle.getName() )")
	public void LoggingAdvice() {
		System.out.println("advice run. Get method called");
	}

	@Before("execution(public String getName() )")
	public void LoggingAdvice1() {
		System.out.println("advice 1run. Get method called");
	}
}
