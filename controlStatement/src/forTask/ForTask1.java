package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//  브론즈
	//  1~100까지 출력하기
		for(int i=0; i<100; i++)
		{
			System.out.print(i+1);
			System.out.print(" ");
		}
		System.out.println("\n");
	//  100~1까지 출력하기
		for(int i=0; i<100; i++)
		{
			System.out.print(100 - i);
			System.out.print(" ");
		}
		System.out.println("\n");
	//  1~100까지 중 짝수만 출력하기
		for(int i=0; i<100; i++)
		{
			if(i%2==0)
			{				
				System.out.print(i+1);
				System.out.print(" ");
			}
		}
		System.out.println("\n");
	//  골드
	//  1~10까지의 합을 출력하기
		int sum1=0;
		for(int i=0; i<10; i++)
		{
			sum1 += i+1;
		}
		System.out.println(sum1);
	//  1~n까지의 합을 출력하기
	  
		int sum2 =0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			sum2 += i+1;
		}
		System.out.println(sum2);
	//  플레티넘
	//  A~F까지 출력하기
		for(int i='A'; i<'G'; i++)
		{
			System.out.print((char)i);
		}
		System.out.println("\n");
	//  A~F까지 중 C를 제외하고 출력하기
		for(int i='A'; i<'G'; i++)
		{
			if(i == 'C')
			{
				continue;
			}
			System.out.print((char)i);
		}
		System.out.println("\n");
	//  다이아
	//  012340123401234 출력하기
	//  aBcDeF...Z까지 출력하기
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(j);
			}
		}
		System.out.println("\n");
//		
		for(int i='a'; i <= 'z'; i++)
		{
			if(i%2 == 1)
			{
				System.out.print((char)i);
			}
			else
			{
				System.out.print((char)(i-32));
			}
		}
		System.out.println("\n");
//		
	//  마스터
	//  별찍기
	//     *  // 별 1,3,5,7,9
	//    *** // 빈공간 4,3,2,1
	//   *****
	//  *******
   //  *********
	int treeNum = 5;
		for(int i = 0; i<treeNum; i++)
		{
			for(int j=treeNum-i-1; j>0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)+1; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

