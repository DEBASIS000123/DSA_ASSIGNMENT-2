package HA_2;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		book b[]=new book[5];
		System.out.println("ENter five book name ,book edition and price :");
		for(int i=0;i<5;i++) {
			String bk=sc.next();
			int be=sc.nextInt();
			double bp=sc.nextDouble();
			b[i]=new book(bk,be,bp);
		}
		System.out.println("Book detils:");
		for(int i=0;i<5;i++) {
			b[i].display();
		}
		book maxprice=b[0];
		for(int i=0;i<5;i++) {
			if(b[i].Bprice>maxprice.Bprice) {
				maxprice=b[i];
			}
		}
		System.out.println("Book with maximum price=");
		maxprice.display();
	}

}
