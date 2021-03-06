package ro.catalin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component(value="circle")
public class Circle implements Shape,ApplicationEventPublisherAware{
	@Resource(name="pointB")
	private Point center;
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw(){
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"didin't find that",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()},"Default point message",null));
		System.out.println(this.messageSource.getMessage("greeting",null,"didn't find",null));
		DrawingEvent drawEvent=new DrawingEvent(this);
		publisher.publishEvent(drawEvent);
	}
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of circle");
	}
	@PreDestroy
	public void distroyCircle(){
		System.out.println("Destroy of circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
}
