package chap14.sec07.exam02;

public class InterruptedExample {

	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e){
			
		}
		Thread.interrupted(); // interrupted 메소드 호출
	}
}
