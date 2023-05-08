package Q5;

public class deposit {
	long principal;
	int time;
	 double rate;
	double total_amt;
	
	deposit(){
		principal=0;
		time=0;
		rate=0;
		total_amt=0;
	}
	deposit(long p,int t,double r){
		principal=p;
		time=t;
		rate=r;
	}
	deposit(long p,int t){
		principal =p;
		time =t;
		rate=0;
	}
	deposit(long p,double r){
		principal=p;
		rate=r;
		time=0;
	}
	void display() {
		System.out.println("principle :"+principal+"\n"+"Time ="+time+"\n"+"Rate="+rate+"\n");
	}
	
	void cal_amount() {
		System.out.println("Total Amount="+(principal+(principal*time*rate)/100));
		
	}
}
