package lambdaExpert;

import java.util.Scanner;

//[심화 실습]
//여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOpers를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결

public class Caffeine {
   
//   연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
   public static Calc calculator(String oper)
   {
      switch(oper) {
         // 덧셈 리턴
         case"+":
            Calc calcAdd = (num1, num2) -> {
               return num1 + num2;
            };
            return calcAdd;
         // 뺄셈 리턴            
         case "-":
            Calc calcSubtract = (num1, num2) -> {
               return num1 - num2;
            };
            return calcSubtract;
         // 나눗셈 리턴
         case "/":
            Calc calcDevide = (num1, num2) -> {
               return num1 / num2;
            };
            return calcDevide;
         // 곱셈 리턴
         case "*":
            Calc calcMultiple = (num1, num2) -> {
               return num1 * num2;
            };
            return calcMultiple;
      }
      // 그 외 값은 null로 리턴 (정상적인 숫자만 입력된다는 가정 하에)
      return null;
   };
   
   // 식에서 숫자 문자열만 넣는 함수 정의
    public String[] getOperatingNumbers(String inputFormat) {
       String[] arrNumbers = inputFormat.split("\\+|\\-|\\*|\\/");
       return arrNumbers;
    }
    
   public static void main(String[] args) {
       Caffeine math = new Caffeine();
       String message = "값을 입력해주세요. ex)7+5-3", format = "";
       Scanner sc = new Scanner(System.in);
       
       int finalResult = 0;
       
       String[] strNumbers = null;
       int[] intNumbers = null;
       String[] operators = null; 
       int newNumberIndex = 0; 
       
       OperCheck operCheck = (express) -> {
          char[] arrExpress = express.toCharArray();
          String operator = "";
          for(int i = 0; i < arrExpress.length; i++) {
             if(arrExpress[i] == '+' || arrExpress[i] == '-' || arrExpress[i] == '*' || arrExpress[i] == '/')
             {
                operator += arrExpress[i];
             }
          }
          return operator.split("");
       };
       
       System.out.println(message);
       format = sc.nextLine();
       
       strNumbers = math.getOperatingNumbers(format);
       operators = operCheck.getOpers(format);
       intNumbers = new int[strNumbers.length];
       
       if(strNumbers[0] == "") {
          String[] strNewNumbers = new String[strNumbers.length - 1];
          String[] newOperators = new String[operators.length - 1];
          
          strNewNumbers[0] = operators[0] + strNumbers[1];
          for(int i = 0; i < newOperators.length; i++) {
             newOperators[i] = operators[i + 1];
          }
          for(int i = 1; i < strNewNumbers.length; i++) {
             strNewNumbers[i] = strNumbers[i + 1];
          }
          operators = newOperators;
          strNumbers = strNewNumbers;
       }
       
       for(int i = 0; i < strNumbers.length; i++) {
       		intNumbers[i] = Integer.parseInt(strNumbers[i]);
       }
       
       int currentNumber = intNumbers[0];
       
       for (int i = 0; i < operators.length; i++) {
           if (operators[i].equals("*") || operators[i].equals("/")) {
           		currentNumber = calculator(operators[i]).calc(currentNumber, intNumbers[i + 1]);
           } else {
           		intNumbers[newNumberIndex] = currentNumber;
           		operators[newNumberIndex] = operators[i];
           		newNumberIndex++;
           		currentNumber = intNumbers[i + 1];
           }
       }
       
       intNumbers[newNumberIndex] = currentNumber;
       finalResult = intNumbers[0];
       
       for (int i = 0; i < newNumberIndex; i++) {
       		finalResult = calculator(operators[i]).calc(finalResult, intNumbers[i + 1]);
       }
       
       System.out.println(finalResult);
   }
}
