package chap09.sec05.exam01;

public class A {
	// A 클래스의 인스턴스 필드와 메소드를 선언
	int field1;
	void method1() {
		
	}
	// A 클래스의 정적 필드와 메소드를 선언 
	static int field2;
	static void method2() {
		
	}
	//인스턴스 멤버 클래스 선언
	class B {
		void method() {
			// A 클래스의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			// A 클래스의 정적 필드와 메소드를 사용
			field2 = 20;
			method2();
		}
	}
	// 정적 멤버 클래스 선언
	static class C{
		void method() {
			// A 클래스의 인스턴스 필드와 메소드 사용
			// field1 = 10; // 사용 불가
			// method1(); // 사용 불가
			
			// A 클래스의 정적 필드와 메소드를 사용
			field2 = 20; // 사용 가능
			method2(); // 사용 가능
			/*
			 * 정적 멤버 클래스(class C)는 바깥 객체(class A)가 없어도 사용 가능해야 하므로
			 * 바깥 클래스의 인스턴스 필드와 인스턴스 메소드는 사용하지 못함
			 */
			
		}
	}

}
