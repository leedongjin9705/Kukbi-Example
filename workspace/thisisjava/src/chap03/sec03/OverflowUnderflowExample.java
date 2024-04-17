package chap03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {//{} 안의 내용을 5번 반복 실행
			var1++; // var1 값을 1씩 증가
			System.out.println("var1 = " + var1);		
		}
		System.out.println("------------------------------------");
		byte var2 = -125;
		for(int i=0; i<5; i++) {//{} 안의 내용을 5번 반복 실행
			var2--; // var2 값 1씩 감소
			System.out.println("var2 = " + var2);
		}
		
	}
}
