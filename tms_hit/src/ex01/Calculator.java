package ex01;

public class Calculator {
	
	int calcNum(int num1, int num2)
	{
		return num1 + num2;
	}
	
	double calcNum(int num1, double num2)
	{
		return num1 + num2;
	}
	
	int calcNum(double num)
	{
		return (int)num;
	}
	
	void calcNum(String word1, String word2)
	{
		String word = word1 + word2;
		System.out.println(word);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.calcNum(1,2));
		System.out.println(calculator.calcNum(1,2.0));
		System.out.println(calculator.calcNum(1.4));
		calculator.calcNum("안","녕");
	}
}
