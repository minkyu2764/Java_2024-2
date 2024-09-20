/*
 * 작성일 : 2024년 9월 20일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 두 정수를 입력 받아 나눗셈의 결과 출력.
 * 0으로 나눌 경우 예외처리를 한다.
 * 단축키 Alt + Shift + Z
*/

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println("나눗셈 결과 : " + num1 / num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("나누는 수가 0이면 안됩니다.");
		}
				
		

	}

}
