package chap08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		// ride() 메소드 호출시 구현 객체를 매개값으로 전달함
		ride(taxi);
		System.out.println();
		ride(bus);

	}
	
	// 인터페이스를 매개변수로 갖는 메소드
	public static void ride(Vehicle vehicle) {
		/* instanceof 연산자
		 * 인터페이스에서도 객체 타입을 확인하기 위해 사용함
		 */
		if(vehicle instanceof Bus bus) {// 매개값으로 받은 vehicle에 대입된 객체가 Bus 객체인지 확인함
			bus.checkFare();
		} 
		vehicle.run();
	}

}
