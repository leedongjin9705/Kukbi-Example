package chap08.sec11.exam01;

public class Car {
	//인터페이스 필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//메소드 
	void run() {
		tire1.roll(); //인터페이스에 선언된 추상 메소드를 호출함
		// ==> 구현 객체의 재정의한 roll() 메소드를 실행함
		tire2.roll();
	}

}
