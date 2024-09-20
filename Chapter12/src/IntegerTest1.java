/*
 * 작성일 : 2024년 9월 13일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 
 *  
*/

public class IntegerTest1 {

	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(13);    // new Integer(13);
		Integer num2 = 25;	//  Auto Boxing 을 이용한 방법이다.
		
		System.out.println("num1이 포장하고 있는 값(정수) : " + num1.intValue());
		System.out.println("num2가 포장하고 있는 값(정수) : " + num2);
		
		num2 = num1 + num2;	// 객체 변수도 연산이 가능하다.
		
		System.out.println("num1 + num2 = " + num2);
		
		System.out.println("num2의 2진수 " + Integer.toBinaryString(num2));
		
		System.out.println("num1 == num2 = " + num1.equals(num2));
		
		
	}

}
