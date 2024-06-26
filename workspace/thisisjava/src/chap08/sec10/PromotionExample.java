package chap08.sec10;

public class PromotionExample {

	public static void main(String[] args) {
		// 구현 객체 선언
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수
		A a;
		
		// 인터페이스 변수에 구현 객체 대입
		a = b; // A <== B // 인터페이스 A로 자동 타입 변환됨
		// B 클래스가 A 인터페이스를 직접적으로 구현하고 있기 때문에 자동 타입 변환됨
		a = c; // A <== C // 인터페이스 A로 자동 타입 변환됨	
		a = d; // A <== D // 인터페이스 A로 자동 타입 변환됨
		//D 클래스가 A 인터페이스를 간접적(B클래스를 상속받음)으로 구현하고 있기 때문에 자동 타입 변환됨
		a = e; // A <== E // 인터페이스 A로 자동 타입 변환됨
		
		//부모 클래스가 인터페이스를 구현하고 있다면 자식 클래스도 인터페이스 타입으로 자동 타입 변환됨

	}

}
