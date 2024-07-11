package July_4;

public class Calculate {
	public double calculateArea(double r) {
		return 3.14*r*r;
	}
	public double calculateArea(double l,double h) {
		return l*h;
	}
	public double calculateArea(double l,double b,double h) {
		return (b*h)/2;
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		
		System.out.println(c.calculateArea(56));
		System.out.println(c.calculateArea(1, 7));
		System.out.println(c.calculateArea(6,8,9));
	}
}
