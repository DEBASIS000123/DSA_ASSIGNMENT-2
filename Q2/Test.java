package Q2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		complex c1=new complex();
		System.out.println("Enter areal and imag. number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		c1.setdata(n1,n2);
		
		complex c2=new complex();
		System.out.println("Enter areal and imag. number:");
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		c2.setdata(n3,n4);
		complex c3=new complex();
		c3=c1.add(c1,c2);
		c3.display(c3);
	}

}
