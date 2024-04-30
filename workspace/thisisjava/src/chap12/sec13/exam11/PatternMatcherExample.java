package chap12.sec13.exam11;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel11004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		/* [a-zA-Z] : 첫글자는 영문자 1글자(영어 대, 소문자 상관없음)
		 * [a-zA-Z0-9] : 두번째 글자 1글자(영어 대,소문자, 숫자)
		 */
		
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다");
		} else {
			System.out.println("ID로 사용할 수 없습니다");
		}

	}

}
