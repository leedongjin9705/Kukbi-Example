package chap12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone("삼성전자","안드로이드");
		
		String strObj = myPhone.toString(); // 메소드 호출
		System.out.println(strObj);
		
		System.out.println(myPhone);
		/* 매개값이 객체가 되면 객체의 ToString() 메소드를 호출
		 * 해서 리턴값을 리턴
		 */
				

	}

}
