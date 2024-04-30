package chap12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // \d 숫자
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		regExp = "\\w+@\\W+\\.\\w+(\\.\\w+)?";
		// angel@company.com(.go) 
		//(\\.\\w+)?  :  한번 더 반복할 수도 있음(안해도 무관)
		data = "angel@mycompany.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}
	}

}