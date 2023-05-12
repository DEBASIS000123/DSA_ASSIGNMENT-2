package Q9;
import java.util.Scanner;
public class exam extends student{
	int mark1;
	int mark2;
	int mark3;
	Scanner sc=new Scanner(System.in);
	void input_marks() {
		System.out.println("Enter the mark-1");
		mark1=sc.nextInt();
		System.out.println("ENter the mark-2");
		mark2=sc.nextInt();
		System.out.println("Enter the mark-3");
		mark3=sc.nextInt();
	}
	void display_results() {
		System.out.println("Mark-1="+mark1);
		System.out.println("Mark-2="+mark2);
		System.out.println("Mark-3="+mark3);
	}
}
