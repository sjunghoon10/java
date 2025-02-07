package methodTask;

public class MethodTask1 {
	void printNum()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	void printName(String name, int num)
	{
		for(int i= 0; i<num; i++)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		mt1.printName("홍길동", 10);
		mt1.printNum();
	}
	
	
}
