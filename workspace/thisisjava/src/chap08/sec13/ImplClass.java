package chap08.sec13;

public class ImplClass implements InterfaceC {
	
	// 상속 받은 InterfaceA에 있는  추상 메소드를 Override 해줌
	public void methodA() {
		System.out.println("methodA() 실행중");
		
	}
	
	// 상속 받은 InterfaceB에 있는  추상 메소드를 Override 해줌
	public void methodB() {
		System.out.println("methodB() 실행중");
		
	}
	
	// InterfaceC에 있는  추상 메소드를 Override 해줌
	public void methodC() {
		System.out.println("methodC() 실행중");
		
	}

}