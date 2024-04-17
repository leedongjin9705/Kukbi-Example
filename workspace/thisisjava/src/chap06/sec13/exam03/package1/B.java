package chap06.sec13.exam03.package1; // A클래스와 패키지가 동일함

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1; // 사용 가능
		a.field2 = 2; // 사용 가능
		// a.field3 = 1; // 사용 불가 <== private 필드로 선언되어 있어서 다른 클래서에서 사용 못함
		
		// 메소드 호출
		a.method1(); // 사용 가능
		a.method2(); // 사용 가능
		// a.method3(); // 사용 불가 <== private 메소드 접근 불가함(컴파일 에러)
		
	}

}
