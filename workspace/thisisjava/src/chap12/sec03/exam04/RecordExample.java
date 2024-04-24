package chap12.sec03.exam04;

/* record 선언
 * 데이터 전달을 위한 DTO 작성시 반복적으로 사용되는 코드를 줄이기 위해 도입
 */

public class RecordExample {

	public static void main(String[] args) {
		Member m = new Member("winter","눈송이", 25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println();
		System.out.println(m.toString());
		
		Member m1 = new Member("winter","눈송이", 30);
		Member m2 = new Member("winter","눈송이", 31);
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hashCode(): " + m2.hashCode());
		System.out.println(m1.equals(m2));
		
		
	}

}
