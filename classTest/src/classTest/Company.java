package classTest;

public class Company {
//  기본 생성자
	public Company() {
	}	
	
	static int money;
	String name;
	int age, income;
	
	public Company(String name, int age, int income)
	{
		this.name = name;
		this.age = age;
		this.income = income;
	}
	// 클래스 필드 구성하기
	// 회사
	// 이름, 나이, 수입
	// 회사의 총 수입

	// 회사원은 총 4명
	// 1번 +10000원
	// 2번 +1000원
	// 3번 +2000원
	// 4번 -20000원
	// 각 회사의 총 수입을 출력하기
	public static void main(String[] args) {
		int sum =0;
		Company koreaIT1 = new Company("장재영", 20, 10000);
		Company koreaIT2 = new Company("함지현", 20, 1000);
		Company koreaIT3 = new Company("양진영", 20, 2000);
		Company koreaIT4 = new Company("김영수", 20, -20000);
		
		sum += koreaIT1.income + koreaIT2.income + koreaIT3.income + koreaIT4.income;
		System.out.println(sum);
	}
}
