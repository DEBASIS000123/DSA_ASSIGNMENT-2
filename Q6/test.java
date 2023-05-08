package Q6;

public class test {
	public static void main(String[] args) {
		circle c=new circle(5);
		square s=new square();
		s.setsquare(5);
		tringle t=new tringle();
		t.settringle(10,10);
		
		System.out.println("Area of circle is:"+c.area());
		System.out.println("Area of square is:"+s.area());
		System.out.println("Area of tringle is:"+t.area());
	}
}
