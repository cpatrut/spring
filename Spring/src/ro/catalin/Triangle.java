package ro.catalin;

public class Triangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public  String toString(){
		return String.format("%d,%d", pointA.getX(),pointA.getY());
	}
	public void draw(){
		System.out.println(toString());
	}
}
