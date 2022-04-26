package java_Q202;

public class Circle_0411_2 {
	int	radius;
	String name;
	
	public Circle_0411_2() {
		radius = 1; name = "";
	}
	public Circle_0411_2(int r, String n) { 
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle_0411_2 pizza = new Circle_0411_2(10, "자바피자");		
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_0411_2 donut = new Circle_0411_2();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
