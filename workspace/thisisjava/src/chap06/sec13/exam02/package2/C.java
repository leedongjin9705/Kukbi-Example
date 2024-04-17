package chap06.sec13.exam02.package2; // A클래스와 패키지가 다름

import chap06.sec13.exam02.package1.A;

public class C {
	//필드 선언
	A a1 = new A(true); // 사용 가능 <== public으로 선언돠어 있어서 다른 패키지에서도 사용 가능
	// A a2 = new A(1); // 사용 불가 <== default 생성자 접근 불가능
	// A a3 = new("문자열"); // 사용 불가 <== private 생성자 접근 불가능

}