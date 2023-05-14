package HA_1;
import java.util.Scanner;
public class demo {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sales amount :");
	double sa=sc.nextDouble();
	if(sa<0) {
		System.out.println("Invalid Input!!!");
	}
	else {
		commission s=new commission(sa);
		System.out.println("Commission :"+commission.getcommission());
	}
	
	
	
	}
	
}
