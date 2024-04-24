package chap12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing : 기본타입 값을 포장 객체로 만드는 과정
		Integer obj = 100;
		System.out.println(obj.intValue());
		// intValue() 메소드는 Integer 객체 내부의 int 값을 리턴함
		
		// UnBoxing : 포장 객체에 기본 타입 값을 얻어내는 과정
		int value = obj;
		System.out.println(value);
		// 연산 시 UnBoxing
		int result = obj + 100;
		System.out.println(result);
		

	}

}
