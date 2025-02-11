package inheritanceTest;

// 상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다.
class Person {
	String name;
	int age;
	String address;
	String num;
	
	public Person() {;}

	public Person(String name, int age, String address, String num) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.num = num;
	}
	
	void work()
	{
		System.out.println(name + "은(는) 일을 한다");
	}
	
	void sleep()
	{
		System.out.println(name + "은(는) 잠을 잔다");
	}
	
	
	void eat()
	{
		System.out.println(name + "은(는) 세 끼를 먹는다");
	}
}

// Student 클래스
// 인스타 아이디
// work 아르바이트를 한다
// sleep 수업 시간에 잠을 잔다
// eat 아침을 거른다
class Student extends Person {
	String instaID;
	
	public Student() {;}
	
	public Student(String name, int age, String address, String num, String instaID) {
		super(name, age, address, num);
		this.instaID = instaID;
	}

	@Override
	void work(){
		System.out.println(name + "은(는) 아르바이트를 한다");
	}
	
	@Override
	void sleep(){
		System.out.println(name + "은(는) 수업 시간에 잠을 잔다");
	}
	
	@Override
	void eat(){
		System.out.println(name + "은(는) 아침을 거른다");
	}
}

class Employee extends Person {
	int money;
	public Employee() {;}
	
	public Employee(String name, int age, String address, String num, int money) {
		super(name, age, address,num);
		this.money = money;
	}
	
	@Override
	void work() {
		System.out.println(name + "은(는) 하루 종일 일을 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println(name + "은(는) 잠을 설친다.");
	}
	
	@Override
	void eat()
	{
		System.out.println(name + "은(는) 야식을 먹는다.");
	}
}
// Employee 클래스
// 비상금
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다.
public class InheritanceTask2 {
// 메인 메서드 생성 후 객체화
// 각 메서드 출력하기
	public static void main(String[] args) {
		Person man = new Person("Bob", 30, "Seoul", "01012345678");
		man.work();
		man.sleep();
		man.eat();
		
		Student peter = new Student("peter", 18, "Seoul", "01012345678", "peter123");
		peter.work();
		peter.sleep();
		peter.eat();
		
		Employee james = new Employee("james", 30, "Seoul", "01012345678", 10000);
		james.work();
		james.sleep();
		james.eat();
	}
}
