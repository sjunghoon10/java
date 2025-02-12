package lambdaTask;

public class LambdaResult {
	
	public static void main(String[] args) {
// 		람다식 구현해서 성과 이름을 전달하고 전체 이름을 콘솔에 출력하기
	
	PrintName printName2 = new PrintName() {
		public String makeName(String firstName, String lastName) {
			return lastName + firstName;
		}
	};
	PrintName printName = (firstName,lastName) -> lastName + firstName;
	System.out.println(printName.makeName("신", "정훈"));
	}
}
