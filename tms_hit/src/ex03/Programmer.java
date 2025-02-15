package ex03;

public class Programmer extends Person {
	boolean noteBook;
	public Programmer() {;}
	
	public Programmer(String name, int age, String job, String hobby, boolean notebook) {
		super(name, age, job, hobby);
		this.noteBook = notebook;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println(name + "은 코딩을 합니다");
	}
	
	@Override
	public void hobby() {
		char[] arData = {'A','B','C','D'};
		for(int i=0; i<arData.length; i++)
		{
			System.out.println(arData[i]);
		}
	}
	
	public void isNoteBook() {
		if(noteBook)
		{
			System.out.println("노트북이 있습니다.");
		}
		else
		{
			System.out.println("노트북이 없습니다.");
		}
	}
	
}
