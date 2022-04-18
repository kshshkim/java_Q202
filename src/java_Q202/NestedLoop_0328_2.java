package java_Q202;

import java.util.Scanner;


public class NestedLoop_0328_2 {
	public static void main(String[] args) {
		String[] values;
		values = new String[82];
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 10; i++) { // 1단에서 9단
			for (int j = 1; j < 10; j++) { // 각 단의 구구셈 출력
				System.out.print(i + "*" + j + "=" + i * j); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기 }
				System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동 }
			
				values[i*j] += "\n"+ i +"*"+j;
			}
		}
		System.out.println("값을 입력하세요");
		int value = scanner.nextInt();
		System.out.println(values[value]);
	}
}