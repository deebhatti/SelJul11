package demo;

public class Calculator {
	
	public void add(int a, int b) { //a and b are called as Formal Parameters
		System.out.println(a+b);
	}
	
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
//		Days d = new Days();
		basicCal.add(100, 200);  //100 and 200 are called as Actual Parameters
		basicCal.subtract(500, 20);
		basicCal.multiply(80, 2);
		basicCal.divide(100, 5);
		Days.day();
		
		
		
		
	}
	
	

}
