package Q5;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount ,Time ,Rate");
		long pm=sc.nextLong();
		int t=sc.nextInt();
		double r=sc.nextDouble();
		deposit d1=new deposit();
		//d1.display();
		deposit d2=new deposit(pm,t,r);
		d2.display();
		deposit d3=new deposit(pm,t);
		//d3.display();
		deposit d4=new deposit(pm,r);
		//d4.display();
		
		d2.cal_amount();
	}

}
