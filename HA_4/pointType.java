package HA_4;

public class pointType {
	double x;
	double y;
	public pointType(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void setCoordinates(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void printCoordinates() {
		System.out.println("("+x+" , "+y+")");
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}

	

}
