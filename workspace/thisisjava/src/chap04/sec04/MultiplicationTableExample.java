package chap04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		int m;
		for(m=2; m<=9; m++) {
			System.out.println("*** " + m + "단");
			
		int n;
		for(n=1; n<=9; n++) {
			System.out.println(m + "x" + n  + " = " + (n*m));
		}
		}

	}

}
