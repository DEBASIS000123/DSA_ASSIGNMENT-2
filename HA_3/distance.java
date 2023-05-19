package HA_3;

public class distance {
	int meters;
	int centimeters;
	public distance(int m,int cm) {
		meters=m;
		centimeters=cm;
	}
	public void display() {
		System.out.println("Distance="+meters+" meters,"+centimeters+" centimeters.");
	}
	public  distance sum(distance d1) {
		int totalmeters=meters+d1.meters;
		int totalcentimeters=centimeters+d1.centimeters;
		if(totalcentimeters>=100) {
			totalmeters=totalmeters+(totalcentimeters/100);
			totalcentimeters%=100;
		}
		distance d=new distance(totalmeters, totalcentimeters);
		return  d;
	}
}
