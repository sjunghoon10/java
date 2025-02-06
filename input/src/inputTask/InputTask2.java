package inputTask;

import java.util.Scanner;

public class InputTask2 {
	
	public static void main(String[] args) {
//	3개의 실수를 한번에 입력받은 뒤
// 	3개의 정수의 곱셈을 출력한다
// 	단, next()만 사용
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, result = 0;
		
		num1 = Double.parseDouble(sc.next());
		num2 = Double.parseDouble(sc.next());
		num3 = Double.parseDouble(sc.next());
		
		result = num1 * num2 * num3;
		System.out.println(result);
//System.out.printf("%d", result);
	}
}
