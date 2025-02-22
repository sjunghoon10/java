package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
		ArrayList<User> users = new ArrayList<User>();
		User user1 = new User(1L, "홍길동", 20, "판사");
		User user2 = new User(1L, "김철수", 20, "코딩");
		User user3 = new User(1L, "김영희", 20, "교사");
		User user4 = new User(1L, "신짱구", 20, "유치원생");
		User user5 = new User(1L, "흰둥이", 20, "개");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		
//		OOO님의 직업은 OOO입니다. 를 jobs.txt에 작성하고, 콘솔에 출력하기
//		Stream API 사용한다.
		BufferedWriter bufferewriter = new BufferedWriter(new FileWriter("jobs.txt"));
		users.forEach((user) -> {
			try {
				bufferewriter.write(user.getName() + "님의 직업은 " + user.getJob() + "입니다\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		bufferewriter.close();

		String line = null;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("jobs.txt"));
		
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
		
	}
}











