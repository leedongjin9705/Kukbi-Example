package chap05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9705081200279";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민 등록 번호 자릿수가 맞습니다");
		} else {
			System.out.println("주민 등록 번호 자릿수가 틀립니다");
		}

	}

}