package chap06.sec13.exam02.package1;  // A클래스와 동일한 패키지

public class B {
	// 필드 선언
	A a1 = new A(true); // 사용 가능
	A a2 = new A(1); // 사용 가능
	A a3 = new A("문자열"); // 사용 불가 <== private 생성자로 선언되어 있어서 다른 클래스에서는 사용 불가능

}
