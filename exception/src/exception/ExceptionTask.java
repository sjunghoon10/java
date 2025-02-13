package exception;

import java.util.Scanner;

public class ExceptionTask {
    public static void main(String[] args) {
        int[] arData = new int[4];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String expression = null, message = "정수 5개를 순서대로 입력하세요", exampleMessage = "번 째 정수";

        System.out.println(message);
        try {
            while (true) {
                count++;
                System.out.println(count + exampleMessage);
                expression = sc.next();
                if (expression.equals("q")) {
                    System.out.println("반복 종료");
                } 
                arData[count - 1] = Integer.parseInt(expression);
            }
        } catch (NumberFormatException e) {
            if (expression.equals("q")) {
                System.out.println("반복 종료");
            } else {
                System.out.println("정수가 아닙니다");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5개 입력하세요");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
