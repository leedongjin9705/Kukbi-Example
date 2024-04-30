package chap14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000); // 3초간 대기
		} catch(InterruptedException e) {
			
		}
		printThread.setStop(true);
		// printThread 종료하기 위해서 stop 필드값을 true로 변경함

	}

}
