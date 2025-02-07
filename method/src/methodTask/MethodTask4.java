package methodTask;

import java.util.Scanner;

public class MethodTask4 {
	Scanner sc = new Scanner(System.in);
//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	int wordCount(String word, char c) {
		int count =0;
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i) == c)
			{
				count++;
			}
		}
		return count;
	}
	
	int findIndex(int num)
	{
		int[] arr1 = new int[5];
		for(int i=0; i<5; i++)
		{
			arr1[i] = sc.nextInt();
		}
		return arr1[num];
	}
	
	char[] wordToChange(String word)
	{
		char[] arr2 = new char[word.length()];
		for(int i=0; i<word.length(); i++)
		{
			arr2[i] = word.charAt(i);
		
			switch(arr2[i])
			{
			case '공':
				arr2[i] = '0';
				break;
			case '일':
				arr2[i] = '1';
				break;
			case '이':
				arr2[i] = '2';
				break;
			case '삼':
				arr2[i] = '3';
				break;
			case '사':
				arr2[i] = '4';
				break;
			case '오':
				arr2[i] = '5';
				break;
			case '육':
				arr2[i] = '6';
				break;
			case '칠':
				arr2[i] = '7';
				break;
			case '팔':
				arr2[i] = '8';
				break;
			case '구':
				arr2[i] = '9';
				break;
			}
		}
		return arr2;
	}
	
	int[] minMax()
	{
		int[] arr = new int[2];
		int max =0;
		int min =0;
		for(int i=0; i<5; i++)
		{
			int num = sc.nextInt();
			if(i == 0)
			{
				max = num;
				min = num;
				continue;
			}
			if(num > max)
			{
				max = num;
			}
			if(num < min)
			{
				min = num;
			}
		}
		arr[0] = max;
		arr[1] = min;
		return arr;
	}
	
	void minMax(int[] arr)
	{
		int max =0;
		int min =0;
		for(int i=0; i<5; i++)
		{
			int num = sc.nextInt();
			if(i == 0)
			{
				max = num;
				min = num;
				continue;
			}
			if(num > max)
			{
				max = num;
			}
			if(num < min)
			{
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
		arr[0] = max;
		arr[1] = min;
	}
	
	int indexOf(String word, char letter)
	{
		char[] arr3 = new char[word.length()];
		for(int i=0; i<word.length(); i++)
		{
			arr3[i] = word.charAt(i);
			if(arr3[i] == letter)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();
//		System.out.println(mt.wordCount("ccc",'c'));
//		System.out.println(mt.findIndex(2));
//		System.out.println(mt.wordToChange("공일이삼"));
//		int[] arr4 = mt.minMax();
//		for(int i=0; i<arr4.length; i++)
//		{
//			System.out.println(arr4[i]);
//		}
		int[] arr5 = new int[2];
		mt.minMax(arr5);
		for(int i=0; i<arr5.length; i++)
		{
			System.out.println(arr5[i]);
		}
//		System.out.println(mt.indexOf("abcd",'c'));
		
	}
}
