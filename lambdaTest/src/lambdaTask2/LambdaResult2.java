package lambdaTask2;

//	1) 1~10까지 출력해주는 람다구현 PrintNum(인터페이스), printUpTo10()
//    2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 Printstring, strCount()
//	3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//	4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//	5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//	x) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
		public static void main(String[] args) {
			
			PrintNum printNum = () -> {
				for(int i=0; i<10; i++) {
					System.out.println(i+1);
				}
			};
			
			PrintString printString = (word,letter) -> {
				int count=0;
				for(int i=0; i<word.length(); i++) {
					if(letter == word.charAt(i)) {
						count++;
					}
				}
				return count;
			};
			
			Reverse reverse = (word) -> {
				String arr = "";
				for(int i=0; i<word.length(); i++) {
					arr += word.charAt(word.length()-1-i);
				}
				return arr;
			};
			
			Remove remove = (word, letter) -> {
				String arr = "";
				for(int i=0; i<word.length(); i++) {
					if(letter != word.charAt(i)) {
						arr += word.charAt(i);
					}
				}
				return arr;
			};
			
			Dedupe dedupe = (word) -> {
				String arr = "";
				boolean isOne;
				for(int i=0; i<word.length(); i++) {
					isOne = true;
					for(int j=i+1; j<word.length(); j++) {
						if(word.charAt(i) == word.charAt(j)) {
							isOne = false;
							break;
						}
					}
					if(isOne == true) {
						arr += word.charAt(i);
					}
				}
				return arr;
			};
			
			printNum.printUpTo10();
			System.out.println(printString.strCount("abcdccc", 'c'));
			System.out.println(reverse.reverseString("abcdefg"));
			System.out.println(remove.removStr("abcdaa", 'a'));
			System.out.println(dedupe.getDedupe("가나다가나다라가나다라마바사"));
		}
}
