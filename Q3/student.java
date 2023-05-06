package Q3;

public class student {
	int roll;
	String name;
	double DSA_Mark;
	void getdata(String name,int roll,double DSA_Mark) {
		this.roll=roll;
		this.name=name;
		this.DSA_Mark=DSA_Mark;
	}
	void showdata() {
		System.out.println("NAME="+name+"\n"+"ROLL="+roll+"\n"+"DSA_Mark="+DSA_Mark+"\n");
	}
}
