package HA_1;

public class commission {
	static double sale;
	commission(double sale){
		this.sale=sale;
	}
	static double getcommission() {
		double com=0;
		if(sale<100) {
			com= (sale/100)*2;
		}
		else if(sale>=500 && sale<5000) {
			com=(sale/100)*5;
		}
		else if(sale>=5000) {
			com=(sale/100)*8;
		}
		return com;
	}
	
}
