package Q10;
import java.util.Scanner;
import Q10_2.sport;
public class student {
	
	String name;
	int roll;
	void input(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	void output() {
		System.out.println("Name="+name);
		System.out.println("ROll Number="+roll);
	}
}
