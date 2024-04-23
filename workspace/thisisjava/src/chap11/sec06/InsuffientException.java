package chap11.sec06;

/*extends Exception(일반 예외로 선언함) : 컴파일러가 체크
 * 
 */

public class InsuffientException extends Exception {
	public InsuffientException() {
		
	}
	
	public InsuffientException(String message) {
		super(message);
		
	}

}
