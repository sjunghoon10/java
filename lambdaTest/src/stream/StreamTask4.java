package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask4 {
	public static void main(String[] args) {
//      1) 1~50까지 ArrayList에 담고 출력하기
//		ArrayList<Integer> datas1 = new ArrayList<Integer>();
//		IntStream.range(0, 50).map(n -> n + 1).forEach(datas1::add);
//		datas1.forEach(n -> System.out.println(n));
		
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		datas2.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
		
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
		ArrayList<Integer> datas3 = new ArrayList<Integer>();
		for(int i = 1; i <= 25; i++) {
			datas3.add(i * 2);
		}
		
		for(Integer data : datas3) {
			System.out.println(data);
		}
		
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Integer> data4 = new ArrayList<Integer>();
		IntStream.rangeClosed('a', 'z').forEach(data4::add);
		
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
		ArrayList<Integer> data5 = new ArrayList<Integer>();
		IntStream.rangeClosed('a', 'z').filter(c -> c % 2 != 0).forEach(data5::add);
		data5.forEach(c -> {
			System.out.println((char)(int)c);
		});
		
//      6) 1~50까지 ArrayList에 담고 10~20만 출력하기
		ArrayList<Integer> datas6 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 50).map(n -> n + 1).forEach(datas6::add);
		datas6.stream()
			.filter(n -> n >= 10)
			.filter(n -> n <= 20)
			.forEach(System.out::println);
		
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
		ArrayList<Integer> datas7 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(n -> datas7.add(n));
		
		Optional<Integer> data = datas7.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b);
		data.ifPresent(total -> System.out.println("결과: " + total));
		Optional<String> result = data.map(total -> "결과 : " + total);
		String total = result.orElseThrow(() -> {
			throw new RuntimeException("결과 없음!");
		});
		
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
		ArrayList<String> datas8 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
		datas8.stream().filter(s -> s.contains("a")).forEach(System.out::println);;
		
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
		
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		int[] datas10 = new int[] {10, 20, 30, 40, 50, 60};
		List<Integer> data10 = Arrays.stream(datas10).boxed().collect(Collectors.toList());
		Integer totalResult = data10.stream().reduce(0, (a, b) -> a + b);
		System.out.println(totalResult);
	}
}












