package collectionTest.hashSetTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ENFP");
		mbtiType.add("INFJ");
		mbtiType.add("ISFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("INFP");
		
		System.out.println(mbtiType);
		Iterator<String> iter = mbtiType.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// Iterator
		// 순서가 없을 때 순서를 부여하는 자료구조
		//mbtiType.iterator()
		
// 		중복된 데이터 삭세
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,9,9,9));
//		datas = ArrayList<Integer>(new HashSet<Interger>(datas));
//		System.out.println(datas);
		
		
	}
}
