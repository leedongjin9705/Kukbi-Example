package chap07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "금색");
		
		// Phone(상속받은 부모 클래스)으로 부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		//Phone(상속받은 부모 클래스)으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요 저는 이동진입니다");
		myPhone.sendVoice("다름이 아니라~");
		myPhone.receiveVoice("아~ 그러시군요");
		myPhone.hengup();
		
		// SmartPhone 메소드 호출
		myPhone.setwifi(false);
		myPhone.setwifi(true);		
		myPhone.internet();

	}

}
