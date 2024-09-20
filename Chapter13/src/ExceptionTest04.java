/*
 * 작성일 : 2024년 9월 20일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 
 * 파일 입출력에 대해 예외처리를 하지 않아 오류가 발생.
*/

import java.io.FileReader;

public class ExceptionTest04 {

	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		
		int i;
		while ((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();

	}

}