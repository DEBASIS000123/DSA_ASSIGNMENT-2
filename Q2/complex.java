package Q2;

public class complex {
	int real;
	int imag;
	void setdata(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	complex add(complex c1,complex c2) {
		complex c3=new  complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		return c3;
		
	}
	void display(complex c) {
		System.out.println(c.real+"+i"+c.imag);
	}
}
