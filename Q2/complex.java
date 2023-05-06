package Q2;

public class complex {
	int real;
	int imag;
	void setdata(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	void display() {
		System.out.println(real+"+ i"+imag);
	}
	public complex add(complex b) {
		complex c=new complex();
		c.real=real+b.real;
		c.imag=imag+b.imag;
		return c;
	}
	
}
