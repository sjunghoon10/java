package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
//		자동 형변환
//		정수 -> 문자열
		System.out.println("1" + 10); // 좌결합성
		System.out.println("1" + 3 + 8);
		System.out.println("1" + (3 + 8));
		
		
//		System.out.println((int)"1" + 100);
		System.out.println(Integer.parseInt("1") + 100);
		
		System.out.println(Double.parseDouble(null) + 20);
		
		System.out.println(Boolean.parseBoolean("true"));
	}
}
