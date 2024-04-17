package chap06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); // 컴파일 에러 
		// Singleton obj2 = new Singleton(); // 컴파일 에러
		
		// 정적 메소드를 호출해서 Singleton() 객체를 생성
		Singleton obj1 = Singleton.getIntance();
		Singleton obj2 = Singleton.getIntance();
		
		// 동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다");
		} else {
			System.out.println("다른 Singleton 객체입니다");
		}
		
	}

}
