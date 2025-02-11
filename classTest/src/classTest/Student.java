package classTest;

public class Student {
//  학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력받고
//	총점과 평균을 출력하기
	String name;
	int korea;
	int english;
	int math;
	int sum;
	int average;
	
	public Student() {;}
	
	public Student(String names, int koreas, int englishs, int maths) {
		name = names;
		korea = koreas;
		english = englishs;
		math = maths;
		sum += korea + english + math;
		average = sum/3;
	}
	
	void printSum() {
		System.out.println("총점은 " + sum);
	}
	
	void printAverage() {
		System.out.println("평균은 " + average);
	}
	
	public static void main(String[] args) {
		Student jh = new Student("정훈", 80, 100, 90);
		jh.printSum();
		jh.printAverage();
	}
}
