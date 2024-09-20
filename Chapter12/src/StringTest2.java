/*
 * 작성일 : 2024년 9월 13일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 *  
*/

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "Java Korea";	// 단축 초기화
		String s2 = new String("Java Korea");
		String s3 = s2.intern();
				// 객체가 가진 문자열을 단축 초기화 문자열로 만들어 반환하는 메소드이다.
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		
		System.out.println(s1 == s2);	// 결과? false.
		System.out.println(s1.equals(s2));	// 결과? true.
		System.out.println(s1 == s3);	// 결과? true.
		System.out.println(s2 == s5); 	// 결과? false.
		System.out.println(s2.equals(s5));	// 결과? true.
		
		// == -> 주소가 같나?? equals -> 값이 같나?
		// 문자열을 비교할 때에는 주로 equals 를 사용한다.

	}

}
