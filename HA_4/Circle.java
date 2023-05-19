package HA_4;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x,y,and radius :");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double r=sc.nextDouble();
		CircleType circle=new CircleType(x,y,r);
		System.out.println("Center of the circle:");
		circle.printCoordinates();
		System.out.println("Radius of circle:");
		circle.printradius();
		System.out.println("Area of circle:");
		circle.printarea();
		System.out.println("Circumference of circle:");
		circle.printcircumference();
		System.out.println("Enter the new radius:");
		double r2=sc.nextDouble();
		circle.setradius(r2);
		System.out.println("New radius of the circle :");
		circle.printradius();
	}

}
