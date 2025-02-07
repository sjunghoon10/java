package arrayTask;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1번 문제
		String message = "텍스트를 입력해주세요.", inputText = null;
	      char [] inputTextChar = null;
	      
	      int numA = 'A', numZ = 'Z', gap = 'a' - 'A';
	      
	      int count = 0;
	      
	      System.out.println(message);
	      
	      inputText = sc.nextLine() + (char)0;
	      while(inputText.charAt(count) != 0) {
	         
	         count++;
	      }
	      
	      inputTextChar = new char[count];
	      
	      for(int i = 0; i < count; i++) {
	         inputTextChar[i] = inputText.charAt(i);
	         
	         if(inputTextChar[i] >= numA
	               && inputTextChar[i] <= numZ) {
	            inputTextChar[i] += gap;
	         }
	         else if(inputTextChar[i] >= numA + gap 
	               && inputTextChar[i] <= numZ + gap) {
	            
	            inputTextChar[i] -= gap;
	         }
	      }
	      
	      for(int i = 0; i < count; i++) {
	         System.out.print(inputTextChar[i]);
	      }
	    System.out.println();
	    
//	    2번 문제
	      String word = "";

	        String message1 = "정수를 입력해주세요. ex)1024";
	        Scanner sc1 = new Scanner(System.in);
	        
	        System.out.println(message1);
	   
	        word = sc.nextLine();
	   
	      
	        int[] arr = new int[word.length()];
	        char[] hangle = new char[word.length()]; 
	        
	        for (int i = 0; i < word.length(); i++) {
	           arr[i] = word.charAt(i);
	        }
	        
	        for (int i = 0; i < word.length(); i++) {
	           switch(arr[i]) {
	              case '0':
	                 hangle[i] = '공';
	                 break;
	              case '1':
	                 hangle[i] = '일';
	                 break;
	              case '2':
	                 hangle[i] = '이';
	                 break;
	              case '3':
	                 hangle[i] = '삼';
	                 break;
	              case '4':
	                 hangle[i] = '사';
	                 break;
	              case '5':
	                 hangle[i] = '오';
	                 break;
	              case '6':
	                 hangle[i] = '육';
	                 break;
	              case '7':
	                 hangle[i] = '칠';
	                 break;
	              case '8':
	                 hangle[i] = '팔';
	                 break;
	              case '9':
	                 hangle[i] = '구';
	                 break;
	           }        
	        }
	       
	    for (int i = 0; i < word.length(); i++) {
	    	System.out.print(hangle[i]);
	    }
	    System.out.println();
	    
	    
//	    3번 문제
		System.out.println("입력: ");

		String word2 = sc.nextLine() + (char)0;
		int count1 =0;
		while(word2.charAt(count1) != 0) {
		         
			 count1++;
		}
		System.out.println("찾을 문자를 입력해주세요.");
		String findWord = sc.next();
		System.out.println("찾을 문자 : " + findWord);
		int num = count1;

		char[] arr2 = new char[num];
		int cnt =0;
		
		for(int i=0; i<num; i++)
		{
			arr2[i] = word2.charAt(i);
			if(arr2[i] == findWord.charAt(0))
			{
				cnt++;
			}
		}
		System.out.println(findWord + "의 개수" + cnt + "개");
	}
}
