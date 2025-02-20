package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask3 {

//    1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//    2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//    모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//    필드 : 이름, 취미, 소개
//    홍길동, 축구_농구_야구, 나는 축구왕!
//    이순신, 개발_당구_축구, 나는 개발자 좋아!
//    장보고, 피아노, 피아노만 한 우물!
//    김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//    김영희, 골프_야구, 운동 선수는 나의 꿈
//    흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
	public static void main(String[] args) {
		
//      1) 1~10까지 ArrayList에 담고 출력하기
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
//      4) a~z까지 ArrayList에 담고 출력하기
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
//      6) 1~50까지 ArrayList에 담고 10~20만 출력하기
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(e -> datas1.add(e));
		datas1.forEach(System.out::println);
		
		ArrayList<Integer> datas3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(e -> datas3.add(e));
		datas3.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		
		ArrayList<Integer> datas4 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).filter(num -> num%2 == 0).forEach(e -> datas4.add(e));
		datas4.stream().forEach(System.out::println);
		
		ArrayList<String> datas5 = new ArrayList<String>();
		IntStream.rangeClosed(65,90).forEach(e -> datas5.add(String.valueOf((char)e)));
		datas5.stream().forEach(System.out::println);
		
		ArrayList<String> datas6 = new ArrayList<String>();
		IntStream.rangeClosed(65,90).filter(e -> e % 2 == 1).forEach(e -> datas6.add(String.valueOf((char)e)));
		datas6.stream().forEach(System.out::println);
		
		ArrayList<Integer> datas7 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).filter(e -> e >= 10 && e <= 20).forEach(e -> datas7.add(e));
		datas7.stream().forEach(System.out::println);
		
		ArrayList<String> datas8 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
		datas8.stream().filter(e -> e.contains("a")).forEach(System.out::println);
		
		System.out.println(IntStream.rangeClosed(1,10).reduce(0,(a,b)->a+b));
		
		ArrayList<Integer> datas9 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(e -> datas9.add(e));
		System.out.println(datas9.stream().reduce(0,(a,b)-> a+b));
		
		ArrayList<Integer> datas10 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60));
		System.out.println(datas10.stream().reduce(0,(a,b)-> a+b));
		 
		 
//		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
//		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
//		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
//		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
//		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
//		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
//		
//		ArrayList<Member> datas2 = new ArrayList<Member>();
//		datas2.add(member1);
//		datas2.add(member2);
//		datas2.add(member3);
//		datas2.add(member4);
//		datas2.add(member5);
//		datas2.add(member6);
//		
//		datas2.stream().map(e-> e.getHobby()).forEach(System.out::println);
//		
//		ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
	}
}
