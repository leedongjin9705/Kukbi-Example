package chap07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// 매개값으로 Bus 객체를 제공하고, driver()매소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		// 매개값으로 Taxi 객체를 제공하고, driver()매소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		/*매개변수의 다형성
		 * 매소드가 클래스 타입의 매개변수를 가지고 있을 경우
		 * ==> 호출시 동일한 타입의 자식 객체를 제공할 수 있음
		 * 어떤 자식 객체가 제공되느냐에 따라 메소드의 실행결과가 다르게 나타남
		 * */
	}

}
