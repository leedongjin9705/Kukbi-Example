package chap06.sec07.exam05;

public class Car {
	//필드 선언
	String comapny = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car(String model){
		this(model, "은색", 250); // 항상 첫줄에 적어야 에러가 없음
		System.out.println("생성자 1");
	}
	
	Car(String model, String color){
		this(model, color, 250);
		System.out.println("생성자 2");
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("생성자 3");
		
	}

}
