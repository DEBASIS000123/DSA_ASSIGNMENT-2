package Q6;

public class circle extends shape{
	int r;
	circle(int r) {
		this.r=r;
	}
	public double area() {
		return Math.PI*r*r;
	}
}
