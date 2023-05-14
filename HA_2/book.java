package HA_2;

public class book {
	String bName;
	int BEdition;
	double Bprice;
	public book(String bn,int be,double bp){
		bName=bn;
		BEdition=be;
		Bprice=bp;
	}
	void display() {
		System.out.println("Book Name="+bName);
		System.out.println("Book Edition="+BEdition);
		System.out.println("Book price="+Bprice);
		System.out.println();
	}
}
