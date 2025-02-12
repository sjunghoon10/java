package abstractTest;

public class Tiger extends PetAdapter{

	@Override
	public void sitdown() {
		System.out.println("호랑이는 앉지 않는다");
	}
	
	@Override
	public void waitNow() {
		System.out.println("호랑이는 기다리지 않는다");
	}
}
