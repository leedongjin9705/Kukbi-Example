package chap04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1; //Math.random()은 0.0 ~ 1.0 보다 적은 double 타입 난수
		System.out.println("num :" + num);
		if(num==1) {
			System.out.println("1번이 나왔습니다");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다");			
		} else if(num==3) {
			System.out.println("3번이 나왔습니다");			
		} else if(num==4) {
			System.out.println("4번이 나왔습니다");			
		} else if(num==5) {
			System.out.println("5번이 나왔습니다");			
		} else if(num==6) {
			System.out.println("6번이 나왔습니다");			
		}
		System.out.println("if 다음 문장 실행");
	}

}
