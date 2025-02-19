package threadTest;

public class Thread1 extends Thread{
	
	public String data;
	public Thread1() {;}
	public Thread1(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i = 0;  i < 5; i++) {
			try {
				System.out.println(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
