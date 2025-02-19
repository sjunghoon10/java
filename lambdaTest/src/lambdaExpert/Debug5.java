package lambdaExpert;

import java.util.Scanner;

public class Debug5 { 
	public static Calc caculater(String oper) {
	
		if(oper.equals("+")) {
			return(a, b) -> a + b; // 덧셈
		}else if(oper.equals("-")) {
		    return(a, b) -> a - b; // 뺄셈
		}else if(oper.equals("*")) {
		    return(a, b) -> a * b; // 곱셈
		}else if(oper.equals("/")) {
		    return(a, b) -> (b != 0 ? a / b : null); // 나눗셈 0으로 나누는 거
		}else{
		    return null; // 잘못된 연산자
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수식을 입력하세요.\n예) 1+2-3*4/5");
		String express = scanner.nextLine();
		
		if(express.charAt(0) == '-') {
		   System.out.println("첫번째 정수는 음수가 되면 안됨!");
		    return;
		}

		String[] numberStr = express.split("\\+|\\-|\\*|\\/"), operator = null; // 연산자를 기준으로 숫자를 분리
		int[] number = new int[numberStr.length]; // 숫자를 저장할 배열
		int opIndex = 0, result = 0;
		
		for(int i = 0; i < numberStr.length; i++) {
		   number[i] = Integer.parseInt(numberStr[i]); // 문자열 >> 정수 변환
		}
		
		operator = new String[numberStr.length - 1]; // 연산자 개수가 숫자 보다 1개 적음
		
		for(int i = 0; i < express.length(); i++) {
		    char c = express.charAt(i);
		    if(c == '+' || c == '-' || c == '*' || c == '/') {
		        operator[opIndex++] = String.valueOf(c); // 연산자를 배열에 저장
		    }
		}
    
		try {
		    for(int i = 0; i < operator.length; i++) {
		        if(operator[i].equals("*") || operator[i].equals("/")) {
		            Calc operation = caculater(operator[i]); // 해당 연산자에 대한 람다식 호출
		            number[i] = operation.calc(number[i], number[i + 1]); // 연산 수행
		
		            for(int j = i + 1; j < number.length - 1; j++) {
		                number[j] = number[j + 1];
		            }
		            number[number.length - 1] = 0; // 마지막 요소를 0으로 설정
		
		            for(int j = i; j < operator.length - 1; j++) {
		                operator[j] = operator[j + 1];
		            }
		            operator[operator.length - 1] = ""; // 마지막 연산자 제거
		
		            i--; // 배열 크기 변경으로 인한 인덱스 조정
	            }
		    }
		} catch (Exception e) {
		     System.out.println("수식을 잘못 입력하셨거나 0으로 나누셨습니다");
		}

		result = number[0]; // 첫 번째 숫자로 초기화
		
		for(int i = 0; i < operator.length; i++) {
		    if(!operator[i].equals("")) { // 빈 값이 아닌 경우에만 연산 수행
		        Calc operation = caculater(operator[i]);
		        result = operation.calc(result, number[i + 1]);
		    }
		}
		
		System.out.println("결과는? : " + result);
    }
}