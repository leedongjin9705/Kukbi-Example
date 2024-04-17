package chap05.sec011;

public class MainStringrrayArgument {

	public static void main(String[] args) {
		if(args.length !=3) {
			System.out.println("프로그램 입력값이 부족합니다");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2];
		
		System.out.println("arg[0] = " + strNum1);
		System.out.println("arg[0] = " + strNum2);
		System.out.println("arg[0] = " + strNum3);

	}

}
