package abstractTest;

public class Cat implements Pet {
	@Override
	public void poop() {
		System.out.println("고양이 모레에 배변훈련");
	}
	@Override
	public void sitdown() {
		System.out.println("앉으라고 하면 지 맘대로 앉는다");
	}
	@Override
	public void waitNow() {
		System.out.println("도망간다");
		
	}
}
