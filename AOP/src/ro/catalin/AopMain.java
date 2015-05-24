package ro.catalin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ro.catalin.model.Circle;
import ro.catalin.service.ShapeService;

public class AopMain {
	public static void main(String [] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		shapeService.getCircle().setName("dummy name");
	}
}
