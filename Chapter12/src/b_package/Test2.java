/*
 * 작성일 : 2024년 9월 13일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 
 *  
*/
package b_package;

import a_package.Test1;		// a_package의 Test1 클래스를 포함시킨다.
// import a_package.*; 		// 패키지 내의 모든 클래스를 포함시킨다.

public class Test2 {

	public static void main(String[] args) {
		Test1 ss = new Test1();
		System.out.println(ss.sum(10, 20));

	}

}
