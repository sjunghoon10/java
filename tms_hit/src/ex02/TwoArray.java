package ex02;

public class TwoArray {
	public static void main(String[] args) {
		int[][] twoArray = new int[3][4];
		
		int num = 1;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				twoArray[i][j] = num;
				System.out.println(num);
				num++;
			}
		}
	}
}
