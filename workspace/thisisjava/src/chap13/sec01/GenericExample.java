package chap13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// Box<String> box1 = new Box<>(String); : 아래와 같은 의미ㄴ
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		/* Box를 생성할 때 타입 파라미터 T 대신 String으로 대체 
		 */
		
		// Box<Integer> box2 = new Box<>(Integer); : 아래와 같은 의미
		Box<Integer> box2 = new Box<>();
		box2.content = 100; // 100은 자동 박싱(객체)
		int value = box2.content;
		System.out.println(value);
		//Box 를 생성할 때 타입 파라미터 T 대신 Integer 로 대체

	}

}
