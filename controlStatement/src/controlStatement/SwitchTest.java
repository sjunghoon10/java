package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
//		계절 맞추기
//		12 1 2 겨울
// 		3 4 5 봄
// 		6 7 8 여름
// 		9 10 11 가을
		
		Scanner sc = new Scanner(System.in);
		String message = "월 수를 입력하세요. \n예)10", seasonResult = "";
		
		int month = 0, season =0;
		
		System.out.println(message);

		month = sc.nextInt();
		if(month > 0 && month <= 12)
		{
			season = month / 3 % 4;
			switch(season) {
			case 0:
				seasonResult = month + "월은 겨울입니다.";
				break;
			case 1:
				seasonResult = month + "월은 봄입니다.";
				break;
			case 2:
				seasonResult = month + "월은 여름입니다.";
				break;
			case 3:
				seasonResult = month + "월은 가을입니다.";
				break;
			default:
				seasonResult = "잘못된 월입니다.";
				break;
			}
		}
		
		System.out.println(seasonResult);
	}
}
