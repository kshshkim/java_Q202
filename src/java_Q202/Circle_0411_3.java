package java_Q202;

public class Circle_0411_3 {
	int radius;
	public Circle_0411_3(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle_0411_3 ob1 = new Circle_0411_3(1);
		Circle_0411_3 ob2 = new Circle_0411_3(2);
		Circle_0411_3 ob3 = new Circle_0411_3(3);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
	}

}
