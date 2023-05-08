package Q6;

public class tringle extends shape{
	int b;
	int h;
	void settringle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public double area() {
		return 0.5*b*h;
	}
}
