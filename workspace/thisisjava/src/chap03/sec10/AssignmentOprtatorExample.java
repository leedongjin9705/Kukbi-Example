package chap03.sec10;

public class AssignmentOprtatorExample {

	public static void main(String[] args) {
		int a = 0;
		
		a += 10; // a = a + 10;
		a *= 10; // a = a * 10;
		a -= 10; // a = a - 10;
		a /= 10; // a = a / 10;
		a++;
		
		int resert = 0;
		resert += 10;
		System.out.println("resert: " + resert);
		resert -= 5;
		System.out.println("resert: " + resert);
		resert *= 3;
		System.out.println("resert: " + resert);
		resert /= 5;
		System.out.println("resert: " + resert);
		resert %= 3;
		System.out.println("resert: " + resert);
	}

}
