package Q1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area code,exchange,number");
		phone p1=new phone();
		int a=sc.nextInt();
		int e=sc.nextInt();
		int n=sc.nextInt();
		p1.input(a, e, n);
		
		System.out.println("Enter area code,exchange,number");
		phone p2=new phone();
		int a1=sc.nextInt();
		int e1=sc.nextInt();
		int n1=sc.nextInt();
		p2.input(a1, e1, n1);
		
		System.out.print("My number is :");
		p1.display();
		System.out.print("Your number is :");
		p2.display();
		
		
	}

}
