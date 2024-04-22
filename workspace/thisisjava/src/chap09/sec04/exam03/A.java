package chap09.sec04.exam03;

public class A {
	// 메소드 선언
	public void method1(int arg) {
		int var = 1; // 로컬 변수 선언
		// 로컬 클래스 선언
		class B{
			// 메소드 선언
			void method2() {
				// 로컬 변수 읽기
				System.out.println(arg); // 가능
				System.out.println(var); // 가능
				//로컬 변수 수정
				// arg = 20; // 수정은 불가
				// var = 30; // 수정은 불가
				/* 로컬 변수를 로컬 클래스에서 시용할 경우 로컬 변수는 final 특성을 갖게되므로
				 * 로컬 변수의 값을 읽을 수만 있음 ==> 로컬 클래스 내부에서 값 변경 불가
				 */
				
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
		b.method2(); // 로컬 객체의 메소드 호출
		// 로컬 변수 수정
		// arg = 20; // 변경 불가
		// var = 30; // 변경 불가
	}

}
