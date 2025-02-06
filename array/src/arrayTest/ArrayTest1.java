package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
// 		자료형 배열명 = {값1, 값2, ...}
// 		자료형 배열명 = new 자료형[칸수]
// 		자료형 배열명 = null;
// 		배열명 = new 자료형[칸수];
		
//		int arr1[] = {10, 20, 30};
//		System.out.println(arr1);
		
		int[] arr2 = {4,23,25,34,56};
		
//		for(int i=0; i < arr2.length; i++){
//			System.out.println(arr2[i]);
//		}
		
		for(int i=0; i< arr2.length; i++)
		{
			arr2[i] = arr2.length-i; 
			System.out.println(arr2[i]);
			
		}
	}
}
