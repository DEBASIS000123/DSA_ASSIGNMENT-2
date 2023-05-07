package Q4;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		product p[]=new product [5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter Product ID and Price:");
			int pi=sc.nextInt();
			double pr=sc.nextDouble();
			p[i]=new product(pi,pr);
		}
		System.out.println("The Product id and Price of product are:");
		for(int i=0;i<5;i++) {
			p[i].display();
		}
		//double ps=product.totalamount();
		product.totalamount();
		
	}

}
