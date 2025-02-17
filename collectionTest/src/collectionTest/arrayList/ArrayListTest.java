package collectionTest.arrayList;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class ArrayListTest {
   public static void main(String[] args) {
      
      ArrayList<Integer> datas = new ArrayList<Integer>(); // 급을 맞춰주기 위해 클래스타입으로 붙인다.
                                             // int --> Integer
//      --> Integer[] arr = new Integer[]; 
      
//      <?> --> 제네릭 문법 : 값이 들어갈 때 타입을 결정한다.
//      제네릭 - 포괄적인, 이름이 없는
      
      //System.out.println(datas.size());  // --> Integer
      
      
//      ArrayList<String> datas = new ArrayList<String>();
//      System.out.println(datas.size()); --> String
      
      
      datas.add(10);
      datas.add(30);
      datas.add(50);
      datas.add(60);
      datas.add(40);
      datas.add(20);
      datas.add(70);
      datas.add(80);
      datas.add(90);
      //System.out.println(datas.size());
      
      
//      예외처리
//      datas.get(0);
      
      
//      모든 데이터 확인
//      반복문(for)
//      for(int i = 0; i < datas.size(); i++) {
//         System.out.println();
//      }
//      필드값이 재정의돼있기때문에 반복문을 사용할 필요가 없다.
//      System.out.println(datas);
      
//      실습
//      추가(삽입)
//      50 뒤에 500을 삽입
      
        datas.add(500);
        //System.out.println(datas);
      
// 		수정 (90 -> 9) 수정
//		삭제
// 		80을 인덱스로 삭제
        
// 		80을 값으로 삭제
      
      System.out.println(datas.indexOf(90));
      
      datas.remove(datas.indexOf(80));
      
      datas.remove(datas.get(7));
      
      System.out.println(datas);
      
      //System.out.println(datas);
      
      if(datas.contains(80))
      {
    	  try {
//			Wrapper 랩퍼 클래스
//    	    작은 것을 큰 것으로 감싸는 것
		} catch (Exception e) {
			// TODO: handle exception
		}
      }
   }
}
