package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {
		public static void main(String[] args) {
//	      25분
		      
//	      브론즈
//	      10~1까지 중 짝수만 배열에 담고 출력
//	      1~10까지 배열에 담고 출력
//	      1~100까지 배열에 담은 후 홀수만 출력
	      
//	      실버
//	      1~100까지 배열에 담은 후 짝수의 합 출력
//	      A~F까지 배열에 담고 출력
//	      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//			int[] arr1 = new int[5];
//			for(int i = 0; i <5; i++)
//			{
//				if((5-i)*2 % 1 == 0)
//				{
//					arr1[i] = (5-i)*2;
//					System.out.print(arr1[i] + " ");
//				}
//			}
//			System.out.println();
//			int[] arr2 = new int[10];
//			for(int i = 0; i <10; i++)
//			{
//				arr2[i] = i+1;
//				System.out.print(arr2[i] + " ");
//			}
//			System.out.println();
//			int[] arr3 = new int[100];
//			for(int i = 0; i <100; i++)
//			{
//				arr3[i] = i+1;
//			}
//			
//			for(int i =0; i<100; i++)
//			{
//				if(arr3[i]%2 ==1)
//				{
//					System.out.print(arr3[i] + " ");
//				}
//			}
//			System.out.println();
//			int sum1=0;
//			for(int i=0; i<arr3.length; i++)
//			{
//				if(arr3[i] % 2 ==0)
//				{
//					sum1 += arr3[i];
//				}
//			}
//			System.out.println(sum1);
//			
//			char[] arr4 = new char[6];
//			for(int i=0; i<6; i++)
//			{
//				arr4[i] = (char)(65 + i);
//				System.out.print(arr4[i] + " ");
//			}
//			System.out.println();
//			for(int i=0; i<6; i++)
//			{
//				if(arr4[i] != 'C')
//				{
//					System.out.print(arr4[i] + " ");					
//				}
//			}
//			System.out.println();
			int[] arr5 = new int[5];
			
			Scanner sc = new Scanner(System.in);
			int max = 0;
			int min = 0;
			
			for(int i=0; i<5; i++)
			{
				arr5[i] = sc.nextInt();
				if(i == 0)
				{
					max = arr5[i];
					min = arr5[i];
					continue;
				}
				if(arr5[i] > max)
				{
					max = arr5[i];
				}
				if(arr5[i] < min)
				{
					min = arr5[i];
				}
			}
			System.out.println("최대값 " + max);
			System.out.println("최솟값 " + min);
			
			int num = sc.nextInt();
			int[] arr6 = new int[num];
			int sum2 = 0;
			for(int i=0; i<num; i++)
			{
				arr6[i] = sc.nextInt();
				sum2 += arr6[i];
			}
			double result = (double)(sum2/num);
			System.out.println(result);
		}
}
