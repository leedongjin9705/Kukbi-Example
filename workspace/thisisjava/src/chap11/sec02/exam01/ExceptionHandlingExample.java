package chap11.sec02.exam01;

public class ExceptionHandlingExample {

    public static void PrintLength(String data) {
    	int result = data.length();
    	System.out.println("문자수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        PrintLength("thisisjava");
        PrintLength(null); // 매개값으로 null을 대입함
        System.out.println("[프로그램 종료]");
    }
}