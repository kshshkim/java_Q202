package java_Q202;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx_0314_2 {

	public static void main(String[] args) {
		String[] info = {"1. 한글 이름", "2. 영어 이름", "3. 주민등록번호", "4. 학교", "5. 학과", "6. 전공", "7. 사용할수 있는 프로그래밍 언어", "8. 자격증", "9. 이메일", "10. 전화번호", "11. 수상경력", "12. 주소"};
		String[] input = new String[12];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 12; i ++) {
			System.out.println(info[i]);
			input[i] = scan.next();
		}
		System.out.print(Arrays.toString(input));
		scan.close();
	}
}

