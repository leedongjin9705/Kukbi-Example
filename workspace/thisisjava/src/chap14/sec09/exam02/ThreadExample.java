package chap14.sec09.exam02;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.setDaemon(true);
		thread.start();
		try {Thread.sleep(1000);} catch(InterruptedException e)
		{}
	}

}
