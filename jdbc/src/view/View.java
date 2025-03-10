package view;

import java.sql.Connection;

import dao.DBConnecter;
import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
// 	회원가입 
		memberVO.setMemberID("ksh1234");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberName("김세환");
		memberVO.setMemberAddress("경기도 구리시");
		
		memberDAO.join(memberVO);
		
		memberVO.setMemberID("ksh12345");
		memberVO.setMemberPassword("1234");
		
		System.out.println(memberVO);
		
//  로그인
      if(memberDAO.login(memberVO)) {
         System.out.println(memberDAO.session);
         System.out.println("로그인 성공");
      } else {
         System.out.println(memberDAO.session);
         System.out.println("로그인 실패");
      }

// 로그아웃
//      memberDAO.logout();
//      
//      memberDAO.delete();
	}
}
