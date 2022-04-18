package java_Q202;

import java.util.Scanner;
public class Grading_0321_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");

		int score = scanner.nextInt(); // 점수 읽기

		String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0"};
		String grade = "F";

		int gijun = 100;
		for(String elem: grades) {
			gijun -= 5;
			if (score >= gijun) {
				grade = elem;
				break;
			}
		}
		System.out.println("학점은 "+ grade + "입니다.");
		scanner.close();
	}
}
