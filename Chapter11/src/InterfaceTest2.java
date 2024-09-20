/*
 * 작성일 : 2024년 9월 13일
 * 작성자 : 컴퓨터소프트웨어공학부 202195007 김민규
 * [설명] 
 *  
*/

abstract class Figure1 {
	abstract void draw();
}

interface Shape1 {
	public void computeArea(double a, double b);
}

class Triangle3 extends Figure1 implements Shape1 { // Shape 1 인터페이스를 포함
	void draw() {	// 메소드 오버라이딩.
		System.out.println("삼각형을 그리는 기능");
		}
	public void computeArea(double a, double h) {	// 메소드 오버라이딩.
		System.out.println("삼각형의 넓이 : " + (a * h / 2));
	}
}

class Polydraw1 {
	public void pdraw(Figure1 f) {	//Figure 형으로 f라고 하는 객체 선언
		f.draw();
	}
	public void pcomputeArea(Shape1 s, double a, double b) {	//Shape1 s 객체 선언.
		s.computeArea(a, b);
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Polydraw1 p = new Polydraw1();
		
		Figure1 fg1 = new Triangle3(); // 형변환 => 다형성
		Shape1 sp1 = new Triangle3();  // 형변환 => 다형성
		
		p.pdraw(fg1);
		p.pcomputeArea(sp1, 4, 4);

	}

}
