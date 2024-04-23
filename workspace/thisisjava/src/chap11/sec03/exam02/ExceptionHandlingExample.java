package chap11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]" + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				// 배열의 인덱스가 초과되었ㅇ을 경우 발생하는 예외처리문
				System.out.println("배열의 인덱스가 초과됨: " + e.getMessage());
			} catch(Exception e) { // 상위 예외 클래스는 아래쪽에 작성함
				System.out.println("실행에 문제가 있습니다");
			}
		}
	}

}