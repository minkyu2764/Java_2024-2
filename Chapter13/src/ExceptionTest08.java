/*
 * 작성일 : 2024년 9월 20일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 
 * 나이를 입력 받아 출력하시오.
 * 입력받은 나이가 정수가 아닐 경우 예외처리 하시오.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		try {
			int age = stdIn.nextInt();
			System.out.println("나이는 " +age +"살 입니다");
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("나이는 정수만 입력하세요.");
		}
		

	}

}
