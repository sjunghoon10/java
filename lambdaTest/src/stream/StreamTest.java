package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 1씩 증가 
//		IntStream.range(0, 10);
//		//IntStream.range(0,10).forEach((num) -> System.out.println(num));		
//		
//		//IntStream.range(0,10).forEach(System.out::println);
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
////		IntStream.rangeClosed(1, 10).forEach((num) -> datas.add(num));
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		
////		참조형
//// 		소속::메서드
//		//datas.forEach(System.out::println);
//		
//// 		10 ~ 1까지 ArrayList만들고, 만든 ArrayList에 값을 담고
////		연산 후 add하기, 모두 출력하기
//		
		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		IntStream.rangeClosed(1, 10).forEach((num) -> {
			datas2.add(10 - num);
		});
		
		//문자열 stream
		String data3 = "ABCDEFG";
		String data4 = "ㄱㄴㄷㄹ";
		//data3.chars().forEach(System.out::println);
		//data4.chars().forEach((c) -> {System.out.println((char)c);});

// 		.map()
		//data4.chars().map((c) -> c + 4).forEach(c -> {System.out.println((char)c);});
		
		User user1 = new User(1, "김세환", 17, "강사");
		User user2 = new User(2, "홍길동", 20, "개발자");
		User user3 = new User(3, "장보고", 30, "요리사");
		User user4 = new User(4, "이순신", 40, "디자이너");
		User user5 = new User(5, "이성계", 50, "사장");
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.forEach(System.out::println);
		//users.stream().map((user) -> user.getJob()).map((job) -> "직업: " + job).forEach(System.out::println);
		//users.stream().map(User::getJob).map((job) -> "직업: " + job).forEach(System.out::println);
		
		//users.stream().map((user) -> user.getAge()).map((age) -> "나이:" + age).forEach(System.out::println);
		
//		실습
		ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		datas3.stream().map((word) -> "/app" + word).forEach(System.out::println);
		
// 		정렬 : sorted()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
		numbers.stream().sorted().forEach(System.out::println);
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		filter()
		
	}
}
