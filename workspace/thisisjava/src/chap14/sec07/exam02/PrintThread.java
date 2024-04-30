package chap14.sec07.exam02;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);; 
				// 일시 정지를 만듦(InteruptedException이 발생할 수 있도록)
			} 
			
		}catch(InterruptedException e) {
			
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	

}
