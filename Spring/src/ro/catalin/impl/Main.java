package ro.catalin.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ro.catalin.Circle;
import ro.catalin.Shape;
import ro.catalin.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
//		Shape shape=(Shape)context.getBean("circle");
//		shape.draw();
//		shape =new Triangle();
		String s=context.getMessage("greeting",null,"didn't find",null);
		System.out.println(s);
		Circle circle=(Circle)context.getBean("circle");
		circle.draw();
	}

}
