package chap06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String Model = "LCD";
	static String info;
	
	// 정적 블록 선언 : 복잡한 초기화 과정이 필요하다면 정적 블록을 이용
	static {
		info = company + "-" + Model;
	}

}
