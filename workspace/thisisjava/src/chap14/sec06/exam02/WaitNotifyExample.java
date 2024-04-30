package chap14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Workobject workobject = new Workobject(); // 공유 작업 객체 생성
		
		ThreadA threadA = new ThreadA(workobject); // 작업 스레드 A 생성 
		ThreadB threadB = new ThreadB(workobject); // 작업 스레드 B 생성 
		
		threadA.start();
		threadB.start();
	}
}
