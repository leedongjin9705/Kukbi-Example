package chap06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		//Korean 객체를 생성시 주민번호와 이름을 전달함
		Korean k1 = new Korean("123456-1234567", "감자바");
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// 필드값 변경
		//k1.nation = "usa" // Final 필드의 값을 변경할 수 없음
		k1.name = "이자바"; //Final이 아닌 필드는 값 변경 가능
		System.out.println("k1.name : " + k1.name);

	}

}
