/*
 * 작성일 : 2024년 9월 13일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명]
 *  StringBuffer를 이용하면 변형이 가능하다.
*/


public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
		
		System.out.println("sb1 내용 : " + sb1);
		System.out.println("sb2 내용 : " + sb2);
		
		System.out.println("문자열 끼워넣기 : " + sb2.insert(8, "Power "));
		sb2.setCharAt(5, '되');
		System.out.println("문자 바꾸기 : " + sb2);
		sb2.setLength(5);
		System.out.println("sb2 내용 : " + sb2);

	}

}
