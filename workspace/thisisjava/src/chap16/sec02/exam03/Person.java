package chap16.sec02.exam03;

public class Person { 
	public void action1(Workable workable) {
		// Workable 을 매개변수로 갖는 action1 메소드 작성
		workable.work("이동진", "프로그래밍");
	}
	
	// speakable 을 매개변수로 갖는 action2 메소드 작성
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}

}
