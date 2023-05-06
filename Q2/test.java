package Q2;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first real and imaginary number:");
		int r1=sc.nextInt();
		int i1=sc.nextInt();
		complex C1= new complex();
		C1.setdata(r1, i1);
		System.out.println("Enter second real and imaginary number:");
		int r2=sc.nextInt();
		int i2=sc.nextInt();
		complex c2=new complex();
		c2.setdata(r2, i2);
		System.out.println("First Complex number is:");
		C1.display();
		System.out.println("Second Complex number is:");
		c2.display();
		complex c=C1.add(c2);
		System.out.println("The resultant Complex is:");
		c.display();
	}

}
