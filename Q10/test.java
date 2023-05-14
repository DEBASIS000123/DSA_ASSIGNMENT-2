package Q10;
import java.util.Scanner;
import Q10_2.sport;

public class test extends student{
	double mark1;
	double mark2;
	void input(double mark1,double mark2) {
		this.mark1=mark1;
		this.mark2=mark2;
	}
	void output() {
		System.out.println("Mark 1 is:"+mark1);
		System.out.println("Mark 2 is:"+mark2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter student name :");
		String s=sc.next();
		System.out.println("Enter the roll number:");
		int r=sc.nextInt();
		student s1=new student();
		s1.input(s,r);
		System.out.println("Enter the mark-1 and mark-2");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		test t=new test();
		t.input(m1, m2);
		sum ss=new sum();
		s1.output();
		t.output();
		ss.totalmark();
		ss.totalScore();
		
		
		
	}

}
