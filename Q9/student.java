package Q9;
import java.util.Scanner;
public class student {
	int roll_Number;
	String name;
	String course;
	Scanner sc=new Scanner (System.in);
	void input_student()
	{
		System.out.println("Enter the roll NUmber:");
		roll_Number=sc.nextInt();
		System.out.println("ENter the name:");
		name=sc.next();
		System.out.println("ENter the course name:");
		course=sc.next();
	}
	void display_student() {
		System.out.println("Roll Number="+roll_Number);
		System.out.println("Name="+name);
		System.out.println("Course"+course);
	}
}
