package chap06.sec13.exam03.package2;

import chap06.sec13.exam03.package1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 10; // 사용 가능
		// a.field2 = 10; // 사용 불가 <== default 필드는 다른 패키지에서는 접근 불가능
		// a.field3 = 10; // 사용 불가 <== private 필드는 접근 불가능(컴파일 에러)
		
		//메소드 호출
		a.method1(); // 사용 가능
		// a.method2(); // 사용 불가 <== default 필드는 다른 패키지에서는 접근 불가능
		// a.method3(); // 사용 불가 <== private 필드는 접근 불가능(컴파일 에러)
		
		
	}

}