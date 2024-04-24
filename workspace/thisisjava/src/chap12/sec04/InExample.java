package chap12.sec04;


public class InExample {

	public static void main(String[] args) throws Exception {
		int speed = 0;
		int KeyCode =0;
		
		while(true) {
			// Enter 키를 치지 않았을 경우에만 실행함
			if(KeyCode != 13 && KeyCode !=10) {
				//유니코드 13, 10은 엔터임
				if(KeyCode == 49) { // 49는 숫자 1을 의미
					speed++;
				} else if(KeyCode == 50) { // 50은 숫자 2를 의미
					speed--; 
				} else if (KeyCode == 51) { // 51은 숫자 3을 의미
					break;
				}
				System.out.println("------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("현재 속도= " + speed);
				System.out.println("선택: ");
			}
			
			// 키를 하나씩 입력 받아 읽음
			KeyCode = System.in.read();
			/* in 필드를 이용해서 read() 메소드를 호출하면
			 * ==> 입력된 키의 코드 값을 얻음
			 */
			/* read() 메서드는 enter 키를 누르기 전까지는 대기 상태임
			 * enter 키를 누르면 입력했던 키들은 하나씩 읽기 시작함
			 */
			
		}
		System.out.println("프로그램 종료");
		
	}

}
