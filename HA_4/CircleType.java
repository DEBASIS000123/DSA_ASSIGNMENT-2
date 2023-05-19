package HA_4;

public class CircleType extends pointType{
	private double radius;
	public CircleType(double x,double y,double radius) {
		super(x,y);
		this.radius=radius;
	}
	public void setradius(double radius) {
		this.radius=radius;
	}
	public void printradius() {
		System.out.println(radius);
	}
	public void printarea() {
		double area=Math.PI*radius*radius;
		System.out.println(area);
	}public void printcircumference() {
		double cir=2*Math.PI*radius;
		System.out.println(cir);
	}
}
