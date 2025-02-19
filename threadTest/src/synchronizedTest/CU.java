package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread sh = new Thread(atm, "세환");
		Thread dg = new Thread(atm, "동건");
		
		sh.start();
		dg.start();
	}
}
