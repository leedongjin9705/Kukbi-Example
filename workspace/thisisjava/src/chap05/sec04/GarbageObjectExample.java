package chap05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		System.out.println(hobby);
		hobby = null;
		System.out.println(hobby);
		String kind1 = "자동차";
		String kind2 = kind1;
		System.out.println(kind1);
		System.out.println(kind2);
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println(kind1);
		System.out.println(kind2);
	}

}
