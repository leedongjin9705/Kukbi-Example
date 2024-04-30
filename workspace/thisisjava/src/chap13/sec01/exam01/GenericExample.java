package chap13.sec01.exam01;

public class GenericExample {

	public static void main(String[] args) {
		// K 대신 Tv로 대체, M 대신 String로 대체함
		Product<TV, String> product1 = new Product<>();
		
		//Setter의 매개삾은 Tv와 String을 제공함
		product1.setKind(new TV());
		product1.setModel("스마트 티비");
		
		//Gettwr 리턴값은 Tv와 String이 됨
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv);
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(car);
		System.out.println(carModel);
		/*Product<K,M> 제네릭 타입을 이용해서 TV 와 Car 객체를 저장하고
		 * 얻는 방법
		 */
		
	}

}
