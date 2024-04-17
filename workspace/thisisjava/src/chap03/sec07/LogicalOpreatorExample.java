package chap03.sec07;

public class LogicalOpreatorExample {

	public static void main(String[] args) {
		//int charCode = 'A';
		//int charCode = 'b';
		int charCode = '5';
		
		if((65<=charCode) & (charCode<=90)) { // & 앞과 뒤 두개의 조건을 모두 비교함
			System.out.println("대문자군요!!");	
		}
		if((97<=charCode) && (charCode<=122)) { // && 앞의 조건식이 false면 뒤 조건식은 평가하지 않고 false를 도출
			System.out.println("소문자군요!!");	
		}
		if((48<=charCode) && (charCode<=57)) {
			System.out.println("0~9 사이의 숫자군요!!");	
		}
		
		//int value = 6;
		int value = 7;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		boolean result = (value % 2 == 0) || (value % 3 == 0);
		System.out.println("result : " + result);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요");
		}

	}

}
