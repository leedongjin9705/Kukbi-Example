package chap04.sec03;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		int time = (int) (Math.random()*4) + 8;
		System.out.println("[현재 시간: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합시다");
			break;
		case 9:
			System.out.println("회의합시다");
			break;
		case 10:
			System.out.println("업무합시다");
			break;
		default:
			System.out.println("외근합시다");
		}
		System.out.println("switch 다음 문장 실행");
	}

}