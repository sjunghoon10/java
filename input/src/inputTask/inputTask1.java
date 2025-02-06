package inputTask;

import java.util.Scanner;

public class inputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과를 출력한다.
// 		단, sc.next()만 사용한다.
// 		실습 10분
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		int answer = 0;
		answer = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println(answer);
	}
}
