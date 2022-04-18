package java_Q202;

import java.util.Scanner;


public class CoffeePrice_0328_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isEnd = false;
		int price = 0;
		String order;

		
		while (!isEnd) {
			System.out.print("무슨 커피 드릴까요? ");
			order = scanner.next();
			switch (order) {
			case "에스프레소":
				price += 3500;
				break;
			case "카푸치노":
				price += 10000;
				break;
			case "카페라떼":
				price += 3000;
				break;
			case "아메리카노":
				price += 2000;
				break;
			case "끝":
				isEnd = true;
				break;
			default:
				System.out.println("메뉴에 없습니다!");
			}

		}
		if (price != 0)
			System.out.print(price + "원입니다");
		scanner.close();
	}
}