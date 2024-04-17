package chap07.sec06.package2;

import chap07.sec06.package1.A;

public class D extends A {
	// 생성자 선언 
	public D() {
		//A() 생성자 호출
		super(); //부모 클래스 
		
	}
	
	//매소드 선언
	public void method() {
		// A 클래스의 필드값을 변경
		this.field = "value"; //(사용 가능)
		//A 클래스의 메소드를 호출
		this.method1();
	}
	
	//메소드 선언 2
	public void method3() {
		/*new 연산자로 A 클래스의 생성자를 직접 호출은 불가능함
		 * 자식 생성자에서 super()로 A 클래스의 생성자를 호출함
		 * */
		//A a = new A(); //안됨
		//a.field = "value"; //안됨
		//a.method1();
	}
 
}
