package java_Q202;

import java.util.Scanner; //

public class ArithmeticOperator_0314_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time / 60) / 60;
		System.out.print(time + "초는 ");
		System.out.print(hour + " : ");
		System.out.print(minute + " : ");
		System.out.println(second + "입니다.");
		scanner.close();
	}
}
