package operTask;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
// 		(마스터)
//      사용자에게 값을 입력받고
//      정수라면 정수입니다.
// 		예 183 -> 입력한 값은 정수입니다.
//      183.5 -> 입력한 값은 실수입니다.
// 		삼항 연산자를 사용하기
		Scanner sc = new Scanner(System.in);
		String result = "";
		String num1 = sc.next();
		int num2 = Integer.parseInt(num1);
		double num3 = Double.parseDouble(num1);
		
		result = num2 == num3 ? "정수입니다" : "실수입니다";
		System.out.println(result);
	}
}
