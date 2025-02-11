package classTest;

class Market {
// 상품, 가격, 재고
// sell 메서드
	String productName;
	int price;
	int count;
	
	public Market() {;}
	
	public Market(String productName, int price, int count) {
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
	void sell(Customer buyer) {
		this.count--;
		buyer.money -= price + (price * buyer.sale);
	}
}

class Customer {
// 이름, 전화번호, 돈, 할인율
	String name;
	String phoneNumber;
	
	int money;
	double sale;
	public Customer() {;}
	
	
	public Customer(String name, String phoneNumber, int money, double sale) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.sale = sale;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
// sell() 사용
// 사람의 돈 출력
// 마켓 상품의 재고 출력
		Market lotte = new Market("아이폰", 10000, 10);
		Customer jh = new Customer("정훈", "01036732680", 30000, 0.1);
		lotte.sell(jh);
		System.out.println("남은돈은 " + jh.money + "원 입니다.");
		System.out.println("재고는 " + lotte.count + "개 입니다.");
	}
}


