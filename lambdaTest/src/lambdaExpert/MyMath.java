package lambdaExpert;

public class MyMath {
	// 연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
	

		public static Calc calculater(String oper)
		{
			switch(oper) {
			case "+" : Calc calc = (num1, num2) -> {
				return num1 + num2;};
				return calc;
			case "-" : Calc calc2 = (num1, num2) -> {
				return num1 - num2;};
				return calc2;
			case "*" : Calc calc3 = (num1, num2) -> {
				return num1 * num2;};
				return calc3;
			case "%" : Calc calc4 = (num1, num2) -> {
				return num1 % num2;};
				return calc4;
			case "/" : Calc calc5 = (num1, num2) -> {
				return num1 % num2;};
				return calc5;
			}
			return null;
		}
		
		public static void main(String[] args) {
//	 		사용자가 수식을 입력
//	 		전체 수식에서 연산자만 분리하는 메서드를 구현
//	        알맞게 연산 처리
//	 		결과값을 출력
			
			// +3-4*3+9/3
			// 곱하기를 찾으면 앞 뒤를 곱한다
			// +3-12+9
			
			OperCheck operCheck = (numbers) -> {
				String[] operators = new String[numbers.length()];
				
				int index =0;
				for(int i=0; i<numbers.length(); i++)
				{
					
					if(numbers.charAt(i) == '+' || numbers.charAt(i) == '-' || numbers.charAt(i) == '*' || numbers.charAt(i) == '%')
					{
						operators[index] = String.valueOf(numbers.charAt(i));
						index++;
					}
				}
				return operators;
			};

			MyMath my = new MyMath();
			
			String n = "-1+5+4-3";
			String[] operStr = operCheck.getOpers(n);
			String[] numberStr = n.split("\\+|\\-|\\*|\\/|\\%");
			
			int index =0;
			int num=0;

			for(int i=0; i<numberStr.length; i++)
			{
				if(i ==0) {
				num = Integer.parseInt(numberStr[i]);
				continue;
				}
				num = my.calculater(operStr[index]).calc(num, Integer.parseInt(numberStr[i]));
				index++;
			}
			
			System.out.println(num);
		}
}
