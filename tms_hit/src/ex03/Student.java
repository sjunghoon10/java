package ex03;

public class Student extends Person{
	int number;
	
	public Student() {;}

	public Student(String name, int age, String job, String hobby, int number) {
		super(name, age, job, hobby);
		this.number = number;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println(name + "은 공부를합니다.");
	}
	
	@Override
	public void hobby() {
		super.hobby();
		for(int i=0; i<10; i++) {
			System.out.println(i+1);
		}
	}
	
	public void printNumber() {
		System.out.println("학생의 이름은" + name + "이며 학번은" + number + "입니다");
	}
}
