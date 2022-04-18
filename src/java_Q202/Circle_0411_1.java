package java_Q202;

import java.util.Scanner;


public class Circle_0411_1 {
    int radius;                    // 원의 반지름 필드
    String name;                // 원의 이름 필드

    public Circle_0411_1() {
    }            // 원의 생성자

    public Circle_0411_1(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {    // 원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("반지름");
        int radius = scanner.nextInt();
        Circle_0411_1 custom_circle = new Circle_0411_1(radius, name);
        double area = custom_circle.getArea();
        System.out.println(custom_circle.name+"의 면적은 "+area);



    }

}
