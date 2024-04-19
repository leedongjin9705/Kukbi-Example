package chap08.sec11.exam02;

public class Driver {
	void drive(Vehicle vehicle) {
		// 구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언함
		vehicle.run(); // 인터페이스 메소드 호출함
		
		/*매개변수의 다형성
		 * 매개변수 타입을 인터페이스로 선언하면 호출시 다양한 구현 객체를 대입할 수 있음
		 */
	}

}
