package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {

//      1번 문제
//      num1 + str1 + str2로 115 만들기
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
     
		System.out.println("" + num1 + ((int)Double.parseDouble(str1) + (int)Double.parseDouble(str2)));
//      2번 문제
//      a, j, k를 연산하여 A, J, K를 출력하기
		System.out.println((char)('a'-32));
		System.out.println((char)('j'-32));
		System.out.println((char)('k'-32));
		
		// a = 97
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
		
		System.out.println("" + (int)(Double.parseDouble("12.123")) 
				+ (int)(Double.parseDouble("345.789")) + (int)(Double.parseDouble("6789.456")));
		
		
		
		
	}
}
 