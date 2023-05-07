package Q4;

public class product {
	int pid;
	double price;
	static double tot_price;
	public product(int p,double pr){
		pid=p;
		price=pr;
		tot_price+=price;
	}
	void display() {
		System.out.println("Product ID:"+pid);
		System.out.println("Price of Product:"+price);
		System.out.println();
		
	}
	static void totalamount() {
		System.out.println("Total price="+tot_price);
	}
}
