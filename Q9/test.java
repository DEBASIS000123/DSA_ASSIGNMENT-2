package Q9;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam e[]=new exam[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the detils of Student "+(i+1)+":");
			e[i]=new exam();
			e[i].input_student();
			e[i].input_marks();
		}
		for(int i=0;i<5;i++) {
			System.out.println();
			System.out.println("Detils of student "+(i+1)+":");
			e[i].display_student();
			e[i].display_student();
		}
	}

}
