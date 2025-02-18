package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		data.stream().forEach(System.out::println);
		
		String data2 = "ABCDEF";
		data2.chars().forEach(System.out::println);
		// ABCDEF를 각 문자별로 출력하기
		// 1~100까지 홀수만 ArrayList에 담고 출력하기
		// A ~ F 중 D를 제외하고 ArrayList에 담고 출력하기
	}
}
