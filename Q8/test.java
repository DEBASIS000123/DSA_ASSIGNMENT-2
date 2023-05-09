package Q8;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no. of persons :");
		int n=sc.nextInt();
		person p[]=new person[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of person "+(i+1));
			String s=sc.next();
			p[i]=new person(s);
		}
		for(int i=0;i<n;i++) {
			p[i].display();
		}
		System.out.println("Highest no. of characters in a name is:"+person.maxcount);
	}

}
