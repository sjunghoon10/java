package castingTask1;

class Video {
	public Video() {;}
}

class Person {
	public Person() {;}
	
	void selectVideo(Video anyVideo)
	{
		
		if(anyVideo instanceof Animation)
		{
			Animation animVideo = (Animation)anyVideo;
			animVideo.subtleOn();
		}
		else if(anyVideo instanceof Movie)
		{
			Movie movieVideo = (Movie)anyVideo;
			movieVideo.fourDOn();
		}
		else if(anyVideo instanceof Drama)
		{
			Drama dramaVideo = (Drama)anyVideo;
			dramaVideo.goods();
		}
	}
}
class Animation extends Video {
	public Animation() {;}
	
	void subtleOn()
	{
		System.out.println("자막 지원");
	}
}

class Movie extends Video{
	public Movie() {;}
	
	void fourDOn()
	{
		System.out.println("4D");
	}
}

class Drama extends Video{
	public Drama() {;}
	
	void goods()
	{
		System.out.println("굿즈");
	}
}


public class CastingTask {
// 넷플릭스
// 애니메이션, 영화, 드라마
// 사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용(출력)
// 드라마라면 "굿즈" 기능 사용(출력)
	
	public static void main(String[] args) {
		Person jh = new Person();
		Video dragonBall = new Animation();
		Video avengers = new Movie();
		Video theGlory = new Drama();
		jh.selectVideo(dragonBall);
		jh.selectVideo(avengers);
		jh.selectVideo(theGlory);
	}
}
