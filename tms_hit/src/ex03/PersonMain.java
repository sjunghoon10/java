package ex03;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Student("정훈", 20, "개발자", "독서", 15);
		Person person2 = new Programmer("정훈", 20, "개발자", "독서", true);
		
		Student student = (Student)person1;
		Programmer programmer = (Programmer)person2;
		
		student.work();
		student.hobby();
		student.printNumber();
		
		programmer.work();
		programmer.hobby();
		//programmer.isNoteBook();
	}
}
