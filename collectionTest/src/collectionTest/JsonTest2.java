package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonTest2 {
	public static void main(String[] args) {
		
		User user1 = new User(1, "김세환", 17, "강사");
		User user2 = new User(2, "홍길동", 20, "개발자");
		User user3 = new User(3, "장보고", 30, "요리사");
		User user4 = new User(4, "이순신", 40, "디자이너");
		User user5 = new User(5, "이성계", 50, "사장");
		
		JSONObject userJSON = new JSONObject();
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
//		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
//			usersJSON.put(user);
//		});
		
		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		System.out.println(usersJSON);
	}
}
