package chap06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// Computer 객체 생성
		Computer myCom = new Computer();
		
		//sum() 메소드 호출시 1,2,3을 제공하고
		// 합산 결과를 리턴받아서 result1 변수에 대입함
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		//sum() 메소드 호출시 1,2,3,4,5을 제공하고
		//합산 결과를 리턴 받아서 result2 변수에 대입함
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : " + result2);
		
		//sum() 메소드 호출시 배열 데이터 전체를 제공하고
		//합산 결과를 리턴 받아서 result3 변수에 대입함
		int[] values = {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		//sum() 메소드 호출시 배열 데이터를 직접 제공하고
		//합산 결과를 리턴 받아서 result4 변수에 대입함
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		//선언된 sum 메소드에 배열(데이터)를 직접 대입할 때는 타입을 다시 선운해줌
		System.out.println("result4 : " + result4);

	}

}
