package chap14.sec07.exam03;

public class PrintThread extends Thread {
	@Override
	public void run() {
		// Thread.interrupted() 를 사용해서 interrupt() 메소드가 호출되었는지 
		// 확인한 후 while 문을 빠져 나가도록 함
		
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
				// interrupt() 메소드가 호출되었다면 true가 되어 break 문이 실행됨
				// while 문을 빠져나감
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}

}