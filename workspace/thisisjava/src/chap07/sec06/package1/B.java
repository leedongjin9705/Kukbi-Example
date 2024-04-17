package chap07.sec06.package1;

public class B {
	// 메소드 선언
	public void method() {
		A a = new A(); // 가능
		a.field = "value"; // 가능
		a.method1(); // 가능
		
	}
	/* protected
	 * A 클래스의 protected로 선언된 필드, 생성자, 메소드는 동일한
	 * 패키지에 저장된 클래스들은 모두 접근해서 사용가능
	 * protected는 같은 패키지에서는 default처럼 모두 접근 가능하지만,
	 * 다른 패키지에서는 접근이 안되지만, 다른 패키지에서 A클래스를 상속
	 * */

}
