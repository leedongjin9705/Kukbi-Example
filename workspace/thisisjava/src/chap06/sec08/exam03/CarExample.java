package chap06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) { // 실행 클래스
		// Car 객체 생성
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
 		if(myCar.isLeftGas()) {
			System.out.println("자동차가 출발합니다");
			//리턴값 없는 run() 메소드 호출
 			myCar.run();
		}
		System.out.println("gsa를 주입하세요");
	}

}
