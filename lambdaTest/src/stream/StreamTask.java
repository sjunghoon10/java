package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
//		1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(datas::add);
		datas.forEach(System.out::println);
		System.out.println(datas.toString());
		for(Integer data: datas) {
			System.out.println(data);
		}
		
//		2) ABCDEF를 각 문자별로 출력하기
		String data2 = "ABCDEFG";
		data2.chars().forEach((c) -> { System.out.println((char)c); });
//		data4.chars().forEach((c) -> { System.out.println((char)c); });
		
//		3) 1~100까지 홀수만 ArrayList에 담고 출력하기
		ArrayList<Integer> datas3 = new ArrayList<Integer>();
		IntStream.range(0, 100).forEach((num) -> {
			if(num%2 ==1) {
				datas3.add(num);				
			}
		});
		System.out.println(datas3);
		
//		4) A~F 중 D를 제외하고 ArrayList에 담고 출력하기
		String data3 = "ABCDEF";
		ArrayList<String> datas4 = new ArrayList<String>();
		data3.chars()
	     .filter((c) -> c != 'D') 
	     .forEach((c) -> datas4.add(String.valueOf((char)c)));
	}
}
