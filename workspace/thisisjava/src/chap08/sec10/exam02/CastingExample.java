package chap08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		// 구현 객체가 인터페이스 타입으로 자동 변환되면, 인터페이스에 선언된 메소드만 사용 가능
		
		// 인터페이스를 통해서 호출
		vehicle.run();
		
		// 강제 타입 변환 후 CheckFare() 호출 가능
		Bus bus = (Bus)vehicle;
		// 인터페이스 타입을 구현 클래스 타입으로 변환시키는 것
		bus.checkFare();
	}

}