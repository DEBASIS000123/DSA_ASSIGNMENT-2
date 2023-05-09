package Q8;

public class person implements detilinfo{
	String name;
	static int maxcount;
	
	person(String name){
		this.name=name;
	}
	public void display() {
		System.out.println("Name of the person is:"+name);
		System.out.println("No. of characters is"+count());
		System.out.println();
	}
	public int count() {
		int c=name.length();
		if(c>maxcount) {
			maxcount=c;
		}
		return c;
	}
}
