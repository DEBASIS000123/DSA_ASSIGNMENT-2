package Q7;

public class employee extends person{
	int eid;
	double salary;
	employee(String name,int age,int e,double s){
		super(name,age);
		eid=e;
		salary=s;
	}
	void empdisplay() {
		System.out.println("Name of Employee:"+name+"\n"+"Age="+age+"\n"+"Employee_ID="+eid+"\n"+"Salary="+salary);
	}
}
