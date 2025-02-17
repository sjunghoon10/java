package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;

// 아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

// 회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);
		}
	}

// 로그인
	public boolean logIn(String id, String passWord) {
		for(User user : users) {
			if(user.getId() == id && user.getPassword() == passWord) {
				return true;
			}
		}
		return false;
	}

// 로그아웃
	public void logOut(User user) {
		for(User findUser : users)
		{
			if(findUser.getId() == user.getId() && findUser.getPassword() == user.getPassword())
			{
				users.remove(user);
			}
		}
	} 
		
// 암호화
	public void crypto(User user) {
		String password = "";
		for(int i=0; i < user.getPassword().length(); i++)
		{
			password += user.getPassword().charAt(i) * 'A'; 
		}
		user.setPassword(password);
	}

	public static void main(String[] args) {
	}
}

// 회원가입

// 로그인

// 로그인 로직

// 로그아웃

// 암호화

// 비밀번호 변경(마이페이지)

// 비민번호 변경(30일)

// 인증번호 전송

// 인증번호 확인
