package HA_3;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Meter and Centimeters :");
		int m1=sc.nextInt();
		int c1=sc.nextInt();
		distance d1=new distance(m1,c1);
		System.out.println("Enter Meter and Centimeters :");
		int m2=sc.nextInt();
		int c2=sc.nextInt();
		distance d2=new distance(m2,c2);
		d1.display();
		d2.display();
		System.out.println("Sum of two distances:");
		distance d3=d2.sum(d1);
		d3.display();
	}

}
