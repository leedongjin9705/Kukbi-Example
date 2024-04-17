package chap02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // Strubg 값을 int 형으로 변환함
		double value2 = Double.parseDouble("3.14"); // Strubg 값을 double 형으로 변환함
		boolean value3 = Boolean.parseBoolean("true"); // Strubg 값을 boolean 형으로 변환함
		
		System.out.println("value1 =" + value1);
		System.out.println("value2 =" + value2);
		System.out.println("value3 =" + value3);
		
		String str1 = String.valueOf(100); // 정수100을 문자열로 변환
		String str2 = String.valueOf(3.14); // 실수 3.14를 문자열로 변환
		String str3 = String.valueOf(false); //boolean 값 false를 문자열로 변환함
		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
		System.out.println("str3 =" + str3);
		System.out.println(str1+str2+str3);

	}

}
