package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId;
	final String SALT = "company";
	final int KEY = 300;
	public static String code;
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
//	15분
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);
		}
	}
	
//	로그인
//	public boolean login(User user) {
//		for(User userInDB : users) {
//			if(userInDB.getId().equals(user.getId())) {
//				if(userInDB.getPassword().equals(user.getPassword())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
//	로그인 로직
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
//	10분
	public void logout() {
		userId = null;
	}

//	암호화
//	20분
	public String encrypt(String password) {
		String encryptPassword = SALT + password;
		String encryptedPassword = "";
		for(int i = 0; i < encryptPassword.length(); i++) {
			encryptedPassword += (char)(encryptPassword.charAt(i) * KEY);
		}
		return encryptedPassword;
	}
	
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(30일)
	
	// 바꾸고 싶은 유저 아이디를 전달받는다
	// 유저 아이디가 존재하면
	// users에서 찾은 다음
	// 비밀번호를 변경한다.
	public void update(User user) {
	}
	
	public boolean update(String password, String newPassword) {
		User userInDB = checkId(userId);
		if(userInDB.getPassword().equals(password))
		{
			userInDB.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}
	
	public void createCode() {
		String randomCode = "";
		for(int i=0; i< 6; i++)
		{
			randomCode += (int)Math.floor(Math.random() *  10);
		}
		code = randomCode;
	}
	
//	인증번호 전송
	public void sendSms(String phoneNumber) {
		 String api_key = "";
	      String api_secret = "";
	      Message coolsms = new Message(api_key, api_secret);
	      
	      // 4 params(to, from, type, text) are mandatory. must be filled
	      HashMap<String, String> params = new HashMap<String, String>();
	      
	      createCode();
	      params.put("to", phoneNumber);
	      params.put("from", "01047099813");
	      params.put("type", "SMS");
	      params.put("text", "[인증번호 6자리]\n" + code + "테스트 문자 발송!");
	      params.put("app_version", "text app 1.2"); // application name and version

	      try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	      } catch (CoolsmsException e) { 
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	      }
	}
	
//	인증번호 확인
	public boolean checkCode(String inputCode) {
		if(code.equals(inputCode)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("abcdefg")); 
		uf.createCode();
		uf.sendSms("01047099813");
		System.out.println(code);
		System.out.println(uf.checkCode("154835"));
	}
}













