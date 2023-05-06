package Q3;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of students:");
		int n=sc.nextInt();
		student s[]=new student[n];
		for(int i=0;i<n;i++) {
			s[i]=new student();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Input Name,Roll and DSA_Mark of student "+(i+1)+":");
			String na=sc.next();
			int ro=sc.nextInt();
			double dm=sc.nextDouble();
			s[i].getdata(na,ro,dm);
		}
		System.out.println("Detils of students are:");
		for(int i=0;i<n;i++) {
			s[i].showdata();
		}
		int top=findtopper(s);
		System.out.println();
		System.out.println("Detils of topper is:");
		s[top].showdata();
	}
	public static int findtopper(student s[]) {
		double max=s[0].DSA_Mark;
		int index=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].DSA_Mark>max) {
				max=s[i].DSA_Mark;
				index=i;
			}
		}
		return index;
	}

}
