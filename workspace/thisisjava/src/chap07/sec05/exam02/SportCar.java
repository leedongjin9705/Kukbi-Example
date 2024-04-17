package chap07.sec05.exam02;

public class SportCar extends Car{
	@Override
	public void speedUP() {
		speed += 10;
	}
	
	// 부모 클래스에서 final로 선언된 메소드는 오버라이딩 안됨
	/*@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/

}
