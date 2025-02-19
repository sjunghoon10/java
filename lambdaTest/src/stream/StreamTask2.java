package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask2 {
		public static void main(String[] args) {
//	      1) 5개의 문자열을 모두 소문자로 변경하기
//	      "Black", "WHITE", "reD", "yeLLow", "PINk"
	      
		  ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINK"));
		  datas.stream().map(e-> e.toLowerCase()).forEach(System.out::println);;
			
		  //System.out.println(datas);
			
//	      2) Apple, banana, Melon, cherry, "딸기"
//	      단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
		  
		  ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
	      datas2.stream()
	      	.filter(str -> str.charAt(0) >= 'A')
	      	.filter(str -> str.charAt(0) <= 'Z')
	      	.forEach(System.out::println);
	      
//	      3) 한글을 정수로 변경
//	      "일공이사" -> 1024
	      
	     String hangle = "공일이삼사오육칠팔구";
	     String word = "일공이사";
	     word.chars().map(e -> hangle.indexOf(e)).forEach(System.out::println);
	     
//	      4) 정수를 한글로 변경
//	      "1024" -> "일공이사"
	    String hangle2 = "공일이삼사오육칠팔구";
	    String data2 = "1";
	    
		}
}
