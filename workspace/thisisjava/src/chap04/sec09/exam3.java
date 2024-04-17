package chap04.sec09;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
 
	        Scanner scanner = new Scanner(System.in);
	        boolean isRunning = true;
	        int balance = 10000; // 초기 잔액은 10000으로 설정

	        while (isRunning) {
	            System.out.println("----------------------------------");
	            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
	            System.out.println("----------------------------------");
	            System.out.print("선택> ");
	            int choice = Integer.parseInt(scanner.nextLine());

	            switch (choice) {
	                case 1:
	                    System.out.print("예금액을 입력하세요: ");
	                    int depositAmount = Integer.parseInt(scanner.nextLine());
	                    balance += depositAmount;
	                    System.out.println("예금이 완료되었습니다.");
	                    break;
	                case 2:
	                    System.out.print("출금액을 입력하세요: ");
	                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
	                    if (withdrawAmount > balance) {
	                        System.out.println("잔액이 부족합니다.");
	                    } else {
	                        balance -= withdrawAmount;
	                        System.out.println("출금이 완료되었습니다.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("현재 잔액은 " + balance + "원 입니다.");
	                    break;
	                case 4:
	                    System.out.println("프로그램을 종료합니다.");
	                    isRunning = false;
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
	            }
	        }
	        scanner.close();
	    }
	}