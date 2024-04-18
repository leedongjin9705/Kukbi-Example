package chap07.sec010.exam01;

public abstract class Phone {
	/* abstract 선언된 클래스 : 추상 클래스
	 * new 연산자를 이용해서 객체를 직접 생성 못함
	 * ==> 상속을 통해서 자식 클래스만 만들수 있음
	 * 실제 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
	 * */
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println(owner + "님이 폰 전원을 켭니다");
	}
	
	void turnOff() {
		System.out.println(owner + "님이 폰 전원을 끕니다");
	}

}
