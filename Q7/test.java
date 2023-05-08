package Q7;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age, Employee id and salary of employee:");
		String n=sc.nextLine();
		int ag=sc.nextInt();
		int e=sc.nextInt();
		double s=sc.nextDouble();
		
		employee emp=new employee(n,ag,e,s);
		System.out.println("Employee Detils:");
		emp.empdisplay();
	}

}
