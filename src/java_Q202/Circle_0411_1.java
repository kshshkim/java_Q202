package java_Q202;

import java.util.Scanner;

public class Circle_0411_1 { //
	int radius;
	String name;
	
	public Circle_0411_1(){}

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle_0411_1 pizza = new Circle_0411_1();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_0411_1 donut = new Circle_0411_1();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		Circle_0411_1 cake = new Circle_0411_1();
		cake.radius = 5;
		cake.name = "자바케이크";
		area = cake.getArea();
		System.out.println(cake.name + "의 면적은 " + area);
		
		Circle_0411_1 cookie = new Circle_0411_1();
		cookie.radius = 1;
		cookie.name = "자바쿠키";
		area = cookie.getArea();
		System.out.println(cookie.name + "의 면적은 " + area);
		
		Circle_0411_1 waffle = new Circle_0411_1();
		waffle.radius = 7;
		waffle.name = "자바와플";
		area = waffle.getArea();
		System.out.println(waffle.name + "의 면적은 " + area);
		
		System.out.println();
		
		Circle_0411_1[] circle = new Circle_0411_1[3];
		for(int i=0; i<3; i++) {
			circle[i] = pizza;
			System.out.print("반지름을 입력하세요 : ");
			circle[i].radius = sc.nextInt();
			System.out.print("이름을 입력하세요 : ");
			circle[i].name = sc.next();
			area = circle[i].getArea();
			System.out.println(circle[i].name + "의 면적은 " + area);
		}
		
		sc.close();
	}
	
}
