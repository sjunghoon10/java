package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.MemberVO;

public class MemberDAO {
   Connection connection;
   PreparedStatement preparedStatement;
   ResultSet resultSet;
   
//    로그인 시 공용저장소(세션)
   public static Long session;
   
//   회원가입
   public void join(MemberVO memberVO) {
      connection = DBConnecter.getConnect();
      String query = "INSERT INTO TBL_MEMBER"
            + "(ID, MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS)"
            + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?)";
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberID());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setString(4, memberVO.getMemberAddress());
         
//         preparedStatement.executeQuery();
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("join(MemberVO) query문 오류");
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
   }
   
//   아이디 중복검사
   public boolean checkId(String memberId) {
      connection = DBConnecter.getConnect();
//      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID" + "\'" + memberId + "\'";
      
//      parepardStatement
      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ?";
      boolean check = false;
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberId);
         
         resultSet = preparedStatement.executeQuery();
         
//         행 부터
         resultSet.next();
         
//         있는지 없는지 검사
         resultSet.getLong(1);
         
      } catch (SQLException e) {
         check = true;
         System.out.println("checkId Query문 오류");
      } finally {
         
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            System.out.println("checkId 쿼리 실행 후 오류");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return check;
   }
   
//   20분
//   로그인
   public boolean login(MemberVO memberVO) {
      connection = DBConnecter.getConnect();
      String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
      boolean check = true;
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberID());
         preparedStatement.setString(2, memberVO.getMemberPassword());

         resultSet = preparedStatement.executeQuery();
         resultSet.next();
         session = resultSet.getLong(1);
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         check = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            System.out.println("checkId 쿼리 실행 후 오류");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return check;
      
   }
   
//   로그아웃 5분
   public void logout() {
      session = null;
   }
   
//   10분
//   정보 수정
   public void update(MemberVO memberVO) {
      connection = DBConnecter.getConnect();
      String query = "UPDATE TBL_MEMBER SET MEMBER_ID = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ? "
            + "WHERE ID = ?";
      
      System.out.println(memberVO);
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberID());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setString(4, memberVO.getMemberAddress());
         preparedStatement.setLong(5, session);
   
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("join(MemberVO) query문 오류");
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
   }
   
//   20분
//   비밀번호 변경
//   1. 비밀번호 찾기
   public void findPassword(MemberVO memberVO) {
      connection = DBConnecter.getConnect();
      String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE MEMBER_ID = ?";
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberPassword());
         preparedStatement.setLong(2, memberVO.getId());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
   }
   
   
//   2. 새로운 비밀번호 변경
   public boolean checkPassword(String memberPassword) {
      connection = DBConnecter.getConnect();
      String query = "SELECT ID FROM TBL_MEMBER WHERE ID = ? AND MEMBER_PASSWORD = ?";
      boolean check = true;
            
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.setString(2, memberPassword);
         resultSet = preparedStatement.executeQuery();
         resultSet.next();
         resultSet.getLong(1);
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         check = false;
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            System.out.println("checkId 쿼리 실행 후 오류");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return check;
   }
   
//   회원탈퇴
//   soft delete
   public void delete() {
      connection = DBConnecter.getConnect();
      String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
      
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
//         열었던 순서의 반대로
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            System.out.println("SQL 쿼리 실행 이후 오류 발생");
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
   }
   
   
   
   
   
   
   
   
   
   
   
}

