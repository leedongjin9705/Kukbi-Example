package chap06.sec15;

public class Singleton { // 라이브러리 클래스
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {
		//생성자를 private 접근 제한해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아서 외부에서 마음대로 객체를 생성하지 못하게 함 
		
	}
	
	//  public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getIntance() {
		return singleton;
	}
	
}
