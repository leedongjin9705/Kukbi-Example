package chap12.sec13.exam12;

public class IntegerCom {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4)); // 내용값만 비교

	}

}
