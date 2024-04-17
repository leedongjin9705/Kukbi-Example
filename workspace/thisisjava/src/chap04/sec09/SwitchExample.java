package chap04.sec09;

public class SwitchExample {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 =switch (grade) {
		case "A"-> 100;
		case "B"-> {
			int result = 100 - 20;
			yield result;
		}

			default -> 60;
		};
		
		System.out.println("score = " + score1);


	}
	

}
