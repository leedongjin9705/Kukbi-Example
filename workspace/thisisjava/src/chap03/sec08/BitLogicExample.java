package chap03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25  =" + (45&25));
		System.out.println("45 | 25  =" + (45|25));
		System.out.println("45 ^ 25  =" + (45^25));
		System.out.println("~45  = " + (~45));
		System.out.println("----------------------------------------");
		
		byte receiveData = -128;
		// 비트 논리곱 연산으로 unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		// 자바 API를 이용해서 unsigned(부호가 없는) 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

	}

}

