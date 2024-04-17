package chap03.sec01;

public class IncreaseDecreseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 1씩 증가
		++x;;
		System.out.println("x = " + x);
		System.out.println("--------------------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("--------------------------------");
		z = x++; // x값을 먼저 z에 대입하고 나중에 x값을 1 증가
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("--------------------------------");
		z = ++x; // x값을 먼저 1 증가시킨후에 그 값을 z에 대입
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("--------------------------------");
		z = ++x + y++; // x값은 1 증가시켜서 연산. y값은 더하기 연산 후 z에 대입시키고 1 증가
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
