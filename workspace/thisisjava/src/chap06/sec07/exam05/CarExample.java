package chap06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car car= new Car("자가용"); // 생성자 1 호출
		System.out.println("car.company : " + car.comapny);
		System.out.println("car.model : "+ car.model);
		System.out.println("car.color : "+ car.color);
		System.out.println("car.maxSpeed : "+ car.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("화물차", "빨강색");// 생성자 2 호출
		System.out.println("car2.company : " + car2.comapny);
		System.out.println("car2.model : "+ car2.model);
		System.out.println("car2.color : "+ car2.color);
		System.out.println("car2.maxSpeed : "+ car2.maxSpeed);
		
		Car car3 = new Car("택시", "검정섹", 300);// 생성자 3 호출
		System.out.println("car2.company : " + car2.comapny);
		System.out.println("car2.model : "+ car2.model);
		System.out.println("car2.color : "+ car2.color);
		System.out.println("car2.maxSpeed : "+ car2.maxSpeed);

	}

}
