package ro.catalin.service;

import ro.catalin.aspect.LoggingAspect;
import ro.catalin.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle(){
		new LoggingAspect().logginAdvice();
		return super.getCircle();
	}
}
