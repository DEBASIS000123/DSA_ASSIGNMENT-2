package Q1;

public class phone {
	int area_code;
	int exchange;
	int number;
	void input(int area_code,int exchange,int number) {
		this.area_code=area_code;
		this.exchange=exchange;
		this.number=number;
				
	}
	void display() {
		System.out.println("("+area_code+") "+exchange+"-"+number);
	}
}
